
FROM openjdk:11-jdk-bullseye

COPY SimpleGUIApp.jar /app/SimpleGUIApp.jar

RUN apt-get update && apt-get install -y \
    x11-apps \
    xauth \
    libxext-dev \
    libxrender-dev \
    libxtst-dev \
    && rm -rf /var/lib/apt/lists/*

ENV DISPLAY=:0

CMD ["java", "-jar", "/app/SimpleGUIApp.jar"]
