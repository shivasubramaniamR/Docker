(Source taken from official Docker Documentation - https://docs.docker.com/get-started/overview/)
# Docker overview

Docker is an open platform for developing, shipping, and running applications. Docker enables you to separate your applications from your infrastructure so you can deliver software quickly. With Docker, you can manage your infrastructure in the same ways you manage your applications. By taking advantage of Docker’s methodologies for shipping, testing, and deploying code quickly, you can significantly reduce the delay between writing code and running it in production.

# The Docker platform
Docker provides the ability to package and run an application in a loosely isolated environment called a container. The isolation and security allow you to run many containers simultaneously on a given host. Containers are lightweight and contain everything needed to run the application, so you do not need to rely on what is currently installed on the host. You can easily share containers while you work, and be sure that everyone you share with gets the same container that works in the same way.

Docker provides tooling and a platform to manage the lifecycle of your containers:

Develop your application and its supporting components using containers.
The container becomes the unit for distributing and testing your application.
When you’re ready, deploy your application into your production environment, as a container or an orchestrated service. This works the same whether your production environment is a local data center, a cloud provider, or a hybrid of the two.


# What can I use Docker for?
## Fast, consistent delivery of your applications

Docker streamlines the development lifecycle by allowing developers to work in standardized environments using local containers which provide your applications and services. Containers are great for continuous integration and continuous delivery (CI/CD) workflows.

Consider the following example scenario:

Your developers write code locally and share their work with their colleagues using Docker containers.
They use Docker to push their applications into a test environment and execute automated and manual tests.
When developers find bugs, they can fix them in the development environment and redeploy them to the test environment for testing and validation.
When testing is complete, getting the fix to the customer is as simple as pushing the updated image to the production environment.

## Responsive deployment and scaling

Docker’s container-based platform allows for highly portable workloads. Docker containers can run on a developer’s local laptop, on physical or virtual machines in a data center, on cloud providers, or in a mixture of environments.

Docker’s portability and lightweight nature also make it easy to dynamically manage workloads, scaling up or tearing down applications and services as business needs dictate, in near real time.

## Running more workloads on the same hardware

Docker is lightweight and fast. It provides a viable, cost-effective alternative to hypervisor-based virtual machines, so you can use more of your compute capacity to achieve your business goals. Docker is perfect for high density environments and for small and medium deployments where you need to do more with fewer resources.

# Docker architecture
Docker uses a client-server architecture. The Docker client talks to the Docker daemon, which does the heavy lifting of building, running, and distributing your Docker containers. The Docker client and daemon can run on the same system, or you can connect a Docker client to a remote Docker daemon. The Docker client and daemon communicate using a REST API, over UNIX sockets or a network interface. Another Docker client is Docker Compose, that lets you work with applications consisting of a set of containers.

## Docker Architecture Diagram
![image](https://user-images.githubusercontent.com/67018853/113247280-4bf6f880-92d8-11eb-8afb-c717a7ea1cfa.png)


# Docker

Command | Description
------------ | -------------
docker pull image | pulls an image from dockerhub
docker images | shows all the images in the current system
docker ps | shows all the running containers
docker ps -a | shows all the containers including the stopped ones
docker run image | creates a container from an image
docker stop container id/name | stops a running container
docker system prune -f | To remove all the stopped containers(docker does not tocuh the running containers)
docker system prune -a | To remove all the stopped containers(docker does not tocuh the running containers) + unused images
docker attach	| Attach local standard input, output, and error streams to a running container
docker build	| 	Build an image from a Dockerfile
docker builder	| 	Manage builds
docker checkpoint	| 	Manage checkpoints
docker commit	| 	Create a new image from a container’s changes
docker config	| 	Manage Docker configs
docker container	| 	Manage containers
docker context	| 	Manage contexts
docker cp	| 	Copy files/folders between a container and the local filesystem
docker create	| 	Create a new container
docker diff	| 	Inspect changes to files or directories on a container’s filesystem
docker events	| 	Get real time events from the server
docker exec	| 	Run a command in a running container
docker export	| 	Export a container’s filesystem as a tar archive
docker history	| 	Show the history of an image
docker image	| 	Manage images
docker images	| 	List images
docker import	| Import the contents from a tarball to create a filesystem image
docker info	| 	Display system-wide information
docker inspect		| Return low-level information on Docker objects
docker kill		| Kill one or more running containers
docker load	| 	Load an image from a tar archive or STDIN
docker login	| 	Log in to a Docker registry
docker logout	| 	Log out from a Docker registry
docker logs	| 	Fetch the logs of a container
docker manifest	| 	Manage Docker image manifests and manifest lists
docker network	| 	Manage networks
docker node	| 	Manage Swarm nodes
docker pause	| 	Pause all processes within one or more containers
docker plugin	| 	Manage plugins
docker port	| 	List port mappings or a specific mapping for the container
docker ps	| 	List containers
docker pull	| 	Pull an image or a repository from a registry
docker push	| 	Push an image or a repository to a registry
docker rename	| 	Rename a container
docker restart	| 	Restart one or more containers
docker rm	| 	Remove one or more containers
docker rmi	| 	Remove one or more images
docker run	| 	Run a command in a new container
docker save	| 	Save one or more images to a tar archive (streamed to STDOUT by default)
docker search	| 	Search the Docker Hub for images
docker secret	| 	Manage Docker secrets
docker service	| 	Manage services
docker stack	| 	Manage Docker stacks
docker start	| 	Start one or more stopped containers
docker stats	| 	Display a live stream of container(s) resource usage statistics
docker stop	| 	Stop one or more running containers
docker swarm	| 	Manage Swarm
docker system	| 	Manage Docker
docker tag	| 	Create a tag TARGET_IMAGE that refers to SOURCE_IMAGE
docker top	| 	Display the running processes of a container
docker trust	| 	Manage trust on Docker images
docker unpause	| 	Unpause all processes within one or more containers
docker update	| 	Update configuration of one or more containers
docker version	| 	Show the Docker version information
docker volume	| 	Manage volumes
docker wait	| 	Block until one or more containers stop, then print their exit codes



# Docker Image Name format
[repository-host:port] / [owner] / imageName [:tag]

1. [repository-host:port] = hub.docker.com
2. [owner] = library(docker official)
3. [tag] = latest


# Docker Run options
Option | Description
---------- | -----------
-d | To run the container in the background
-i | To attach the standard input to the container
-t | To attach the Standard Ouput to the container
--name somename | To assign given name to our container
--entrypoint=/bin/bash | Entry point is the command to be executed once a container is created.<br>An Image might have an entry point already.<br>This option Overrides the container's entrypoint
                         
                         
                         
 docker run -d imagename<br>
 docker run -it imagename<br>
 docker run -it --entrypoint=/bin/bash imagename
 
 
 # Port Mapping
 
 docker run -p hostport:containerport image
 
 # Volume Mapping
 docker run -v /path/to/host/dir : /path/to/container/dir image
 
 # Creating a Network
 docker network create somename
 docker run --network=somename ubuntu
 docker run --network=somename nginx
 
 # Creating a Image
 Command | Description
 --------|------------
 FROM image | The image which needs to be used as a base image. Very first command in Dockerfile.
 ADD host-files container files | Add files from your host to your image
 RUN Command | Runs any given command - useful to install any software, create directories etc
 ENV envVar envValue | Sets an environment value in the image
 WORKDIR dir | sets a default working directory. [if we ignore / is the working directory]
 EXPOSE port-# | Exposes a port for your application
 ENTRYPOINT command to be executed | Command to be executed once a container is created from this image
 '#' | comments the line
 
 From Image
 ADD /my/Test.java /a/b/c/Test.java
 RUN apt-get install java
 ENV JAVA_HOME=/some/path
 WORKDIR /a/b/c
 EXPOSE 8050
 ENTRYPOINT sleep 5
 
 # Command to create a image
 docker build -t=ownername/imagename directory
 (ex: docker build -t=somename/imagename .)
 
 # Passing Variable to the docker image 
 -e is the flag to use the paramater
 
 docker run -e /fileowner/imagename
 
 # Tagging the Image Name
 docker tag /fileowner/imagename:latest /fileowner/imagename:release name
 
 # Container Logs
 container logs can be retrived even after the container status is exited.
 docker logs containername/containerid
 
 # Docker Compose
 Command | Description<br>
 --------| -----------------
 docker-compose | commmand to use the docker compose<br>
 docker-compose up | Command to start the docker compose yaml file<br>
 docker-compose up -d | To start the docker compose yaml file in background<br>
 docker-compose down | To bring down the docker 
 
 
 Yaml file configuration
 
 Version:"3"<br>
 services: <br>
    somename:<br>
      image:ownername/imagename<br>
      container_name:somename<br>
      ports:<br>
        -"3020:8030"<br>
      environment:<br>
        -parametername=parametervalue<br>
        -URL=someurl<br>
      working_directory:/a/b/c        - 
      volumes:<br>
        -hostpath:containerpath<br>
      entrypoint: "required operation and concatenate with &&"
      depends_on: "used for another container to start"
 
 
 # Docker Scaling containers
 Command : docker-compose up -d --scale servicename=4 --scale anotherservicename=4

