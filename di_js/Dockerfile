FROM node:21
LABEL authors="daclinhgiaonguyen"

WORKDIR /app

COPY package.json ./
COPY package-lock.json ./
COPY . .

RUN npm install

CMD ["npm", "start"]