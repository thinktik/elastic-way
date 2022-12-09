from flask import Flask, request

app = Flask(__name__)


@app.route('/')
def index():  # put application's code here
    return {
        "developer": "ThinkTik",
        "echo": "AWS 演练",
        "lang": "Python 3.10",
    }


@app.route('/ping')
def ping():  # put application's code here
    return {
        "developer": "ThinkTik",
        "echo": "AWS 演练",
        "lang": "Python 3.10",
    }


@app.route('/subscribe', methods=['POST'])
def subscribe():  # put application's code here
    payload = request.get_json()
    print(payload)
    print(request.get_data())
    return {
        "developer": "ThinkTik",
        "echo": "AWS 演练",
        "lang": "Python 3.10",
    }


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=8085)
