# Use the official Golang image as base
FROM golang:1.21-alpine AS build

LABEL authors="daclinhgiaonguyen"

# Set the current working directory inside the container
WORKDIR /app

# Copy the Go modules files
COPY go.mod .

# Download and install dependencies
RUN go mod download

# Copy the rest of the application source code
COPY . .

# Build the Go application
RUN go build -o main .

# Start a new stage from scratch
FROM alpine:latest

# Set the current working directory inside the container
WORKDIR /app

# Copy the executable from the previous stage
COPY --from=build /app/main .

# Command to run the executable
CMD ["./main"]
