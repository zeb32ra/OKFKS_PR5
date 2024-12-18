FROM openjdk:17-jdk-bullseye

WORKDIR /app

COPY calc.jar /app/application.jar

RUN apt-get update && apt-get install -y \
    x11-apps \
    xauth \
    libxext-dev \
    libxrender-dev \
    libxtst-dev \
    && rm -rf /var/lib/apt/lists/*

ENV DISPLAY=:0

CMD ["java", "-jar", "application.jar"]
