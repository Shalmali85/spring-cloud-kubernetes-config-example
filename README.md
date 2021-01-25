# Spring Cloud Kubernetes Config Example

## Versions used
- Kubernetes 1.20
- Minikube 1.16.0
- Docker 20.10.2
- Spring Boot 2.2.2.RELEASE
- Spring Cloud Kubernetes Config 1.1.0.RELEASE


## Commands
- minikube start
- docker build -t docker_hub/config-kubernetes:0.01 .
- docker push docker_hub/config-kubernetes:0.01
- kubectl apply -f config.yaml - For applying the ConfigMap changes
- kubectl apply -f deploy.yaml - For applying deployment and service changes
- kubectl apploy -f role.yaml - Optional in case service account exception (cannot access resource listed in namespace)
- kubectl get pods
- kubectl logs -f <pod_name>  - For tailing the logs from the pod
- kubectl get deployments -- To list all deployments
- kubectl get deployment name  -- To list the pod specific deployment
- kubectl get services -- To list all deployments
- kubectl get service service_name  -- To list the pod specific deployment(Access externalip:nodeport to acess th erest endpoint or use minikube command mentioned below)
- minikube service service_name
- kubectl delete deployment name -- to delete deployment and remove the pod
- kubectl delete service name -- to delete deployment and remove the pod

For changes in config.yaml at runtime
change properties values in config.yaml
- kubectl apply -f config.yaml apply config changes
- curl -X POST http://externalIp:nodeport/actuator/refresh 
- check the rest endpoint /api/message to view the changed value

