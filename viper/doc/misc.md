```
aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 843245141269.dkr.ecr.us-east-1.amazonaws.com

viper_version=v0.0.1
docker build -t viper:${viper_version} .
docker tag viper:${viper_version} 843245141269.dkr.ecr.us-east-1.amazonaws.com/viper:${viper_version}
docker push 843245141269.dkr.ecr.us-east-1.amazonaws.com/viper:${viper_version}
```


create ecs task: `aws ecs register-task-definition --cli-input-json file://ecs_task.json`


```
docker rm $(docker ps -q -f status=exited)
docker rmi $(docker images -q -f dangling=true)
```