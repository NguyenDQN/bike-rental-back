To build a new jar: ./gradlew build

TO build docker image:
    cd to the folder contains DockerFiles
    docker build -t bike-rental-back:v0.0.1 .
    
To run container on docker:
    docker run -p 8080:80 bike-rental-back-v4
    8080: port on local machine
    80: exposed port on docker

- Start minikubec: `minikube start` (incase it does not work start with--insecure-registry)
- In the new terminal, run `eval $(minikube docker-env)`
- Build image `docker build . -t bike-rental-back`
- Run `kubectl apply -f k8s_deployment.yaml` to create a deployment
- Expose deployment as service, port of service must be the same as port exposed port of the image
- We can use `minikube image load my_image` to load image from our docker to minikube
- After apply the deployment, go to User-ws(https://github.com/NguyenDQN/user-ws) to apply the ingress

Docs for ingress: https://kubernetes.io/docs/tasks/access-application-cluster/ingress-minikube/

Then we can access this url: https://bike-rental.nguyen/bike-ws/bikes
  
Note: build a new jar -> build docker image -> update image in yaml file -> apply to kubectrl

To get url of service:
- kubectl get svc
- minikube service service-name --url

Test commit
