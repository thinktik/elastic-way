from urllib import request

from flask import Flask

app = Flask(__name__)


@app.route('/')
def index():  # put application's code here
    return {
        "service_code": 1200,
        "message": "SUCCESS",
        "data": {
            "developer": "ThinkTik",
            "echo": "EKS 演练",
            "lang": "python3.10"
        }
    }


@app.route('/ping')
def ping():  # put application's code here
    return {
        "service_code": 1200,
        "message": "SUCCESS",
        "data": {
            "developer": "ThinkTik",
            "echo": "EKS 演练",
            "lang": "python3.10"
        }
    }


@app.route('/invoke_gorilla')
def invoke_gorilla():  # put application's code here
    resp = request.urlopen("http://gorilla-service.omoz-b:8087/ping")
    r = resp.read().decode("UTF-8")
    return r


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=8085)