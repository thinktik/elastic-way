var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function (req, res, next) {
    res.json({
        "service_code": 1200,
        "message": "SUCCESS",
        "data": {
            "developer": "ThinkTik",
            "echo": "EKS 演练",
            "lang": "nodejs 16.x"
        }
    });
});

/* GET home page. */
router.get('/ping', function (req, res, next) {
    res.json({
        "service_code": 1200,
        "message": "SUCCESS",
        "data": {
            "developer": "ThinkTik",
            "echo": "EKS 演练",
            "lang": "nodejs 16.x"
        }
    });
});

module.exports = router;
