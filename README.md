# springboot-project
# Baby Medicine Information & Safety Tracker – Automated CI/CD and Kubernetes Deployment
# Baby Medicine Information & Safety Tracker

A Spring Boot REST API for securely managing baby profiles, prescribed medicine information, prescription schedules, and medication reminders.

> **Safety Notice:** This application is designed for information tracking and prescription management. It does not diagnose medical conditions, recommend medicines, or calculate medication dosages. Medication for babies should only be administered according to instructions from a qualified healthcare professional.

---

## 📌 Project Overview

Parents and caregivers often need to keep track of prescribed medicines, schedules, expiry dates, allergies, and prescription history.

The **Baby Medicine Information & Safety Tracker** provides a centralized application to manage this information.

The application is built using **Java Spring Boot** and is designed to be extended into a complete DevOps project using Docker, Jenkins, Kubernetes, Terraform, and AWS.

---

## 🎯 Objectives

* Maintain baby profiles
* Record allergy information
* Store prescribed medicine information
* Maintain prescription schedules
* Track prescription history
* Track medicine expiry dates
* Provide REST APIs for application integration
* Containerize the application using Docker
* Automate CI/CD using Jenkins
* Deploy the application using Kubernetes
* Provision cloud infrastructure using Terraform
* Deploy the application on AWS
* Monitor the application using Prometheus and Grafana

---

## 🛠️ Technology Stack

### Application

* Java 17
* Spring Boot
* Spring Web
* Maven
* REST API

### DevOps

* Git
* GitHub
* Jenkins
* Docker
* Docker Hub
* Kubernetes
* Minikube
* Terraform

### Cloud

* AWS EC2
* AWS VPC
* AWS IAM
* AWS EKS
* AWS RDS
* AWS CloudWatch

### Monitoring & Security

* Prometheus
* Grafana
* SonarQube
* Trivy
* 
---

## 🚀 Planned DevOps Architecture

                       Developer
                           |
                           v
                        GitHub
                           |
                           v
                        Jenkins
                           |
              +------------+------------+
              |                         |
          Build/Test                Security Scan
              |                         |
              +------------+------------+
                           |
                           v
                      Docker Build
                           |
                           v
                       Docker Hub
                           |
                           v
                     Kubernetes
                           |
             +-------------+-------------+
             |             |             |
          Frontend      Backend       Database
                           |
                        PostgreSQL
                           |
                    Prometheus/Grafana
                           |
                           v
                          AWS

# 📂 Project Structure

```text
baby-medicine-tracker/
│
├── pom.xml
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/babymedicine/
│       │       ├── BabyMedicineApplication.java
│       │       ├── Baby.java
│       │       ├── Medicine.java
│       │       ├── Prescription.java
│       │       ├── BabyController.java
│       │       ├── MedicineController.java
│       │       └── PrescriptionController.java
│       │
│       └── resources/
│           └── application.properties
│
├── Dockerfile
├── Jenkinsfile
├── docker-compose.yml
│
├── kubernetes/
│   ├── deployment.yaml
│   ├── service.yaml
│   ├── configmap.yaml
│   ├── secret.yaml
│   └── hpa.yaml
│
├── terraform/
│   ├── provider.tf
│   ├── main.tf
│   ├── variables.tf
│   └── outputs.tf
│
└── README.md

# 💻 How to Run Locally

## Prerequisites

Install:

* Java 17
* Maven
* Git
---

# Build the Application
# Run the Application

# 🐳 Docker Deployment

Build the Docker image
Run the container

---

# ☸️ Kubernetes Deployment

Apply the Kubernetes manifests:

---

# 🔄 CI/CD Pipeline

The Jenkins pipeline automates the application lifecycle:

Developer
    |
    v
Git Push
    |
    v
GitHub
    |
    v
Jenkins
    |
    +---- Checkout
    |
    +---- Maven Build
    |
    +---- Unit Tests
    |
    +---- SonarQube Analysis
    |
    +---- Docker Build
    |
    +---- Trivy Security Scan
    |
    +---- Docker Push
    |
    +---- Kubernetes Deployment

---

# ☁️ AWS Deployment

Terraform is used to provision AWS infrastructure.

Planned infrastructure:
AWS
│
├── VPC
│
├── Public Subnet
│
├── Private Subnet
│
├── Internet Gateway
│
├── Route Tables
│
├── Security Groups
│
├── EKS
│
└── RDS PostgreSQL

---

# 📊 Monitoring

Prometheus and Grafana will be used to monitor:

* CPU utilization
* Memory utilization
* Application availability
* Request count
* Response time
* Pod status
* Pod restarts
* Kubernetes resources

# 📈 Future Enhancements

The project can be extended with:

* PostgreSQL database
* React frontend
* User authentication
* Role-based access control
* Prescription reminders
* Medicine expiry notifications
* Email notifications
* SMS notifications
* Audit logging
* Prometheus monitoring
* Grafana dashboards
* Kubernetes HPA
* AWS EKS deployment
* Terraform modules
* Automated rollback
* Blue-green deployment
* Canary deployment

---

# 🎓 DevOps Skills Demonstrated

This project demonstrates practical experience with:

Git
GitHub
Linux
Java
Spring Boot
Maven
Docker
Docker Hub
Jenkins
CI/CD
Kubernetes
Minikube
Terraform
AWS
IAM
VPC
EKS
RDS
Prometheus
Grafana
SonarQube
Trivy
---

# ⚠️ Medical Safety

This application is a **tracking and information-management system**.

It does not:

* Diagnose illnesses
* Recommend medicines
* Calculate doses
* Replace a pediatrician
* Determine whether a medicine is appropriate for a baby

Parents and caregivers should follow instructions provided by a qualified healthcare professional.

---

# 👩‍💻 Author

**Yamini**

DevOps / Cloud Intern

Skills:

`AWS` `Docker` `Kubernetes` `Jenkins` `Terraform` `Git` `Linux` `Java` `Maven`

---

## ⭐ Project Goal

The goal of this project is to demonstrate the complete DevOps lifecycle:

```text
Plan
 ↓
Code
 ↓
Build
 ↓
Test
 ↓
Security Scan
 ↓
Containerize
 ↓
CI/CD
 ↓
Deploy
 ↓
Monitor
 ↓
Scale
```

**This project is built as a learning and DevOps portfolio project.**

