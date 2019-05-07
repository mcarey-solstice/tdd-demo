# Test Driven Development

## Requirements
* [Java](https://java.com/en/download/help/download_options.xml)

### Optional
* [Docker](https://docs.docker.com/install/)
* [Docker Compose](https://docs.docker.com/compose/install/)

## Setup
1. Startup Jenkins:
```bash
docker-compose up -d
```
2. Open a browser to http://localhost:${JENKINS_PORT:-8000}
3. Once Jenkins loads, enter the password stored in `.jenkins/secrets/initialAdminPassword`
4. Install plugins:
  * Git
  * Gradle
  * Pipeline