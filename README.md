# Test-Dansmultipro

This project is a test from PT Dans Multi Pro

## Technology Stack
1. Java 1.8
2. Spring Boot
3. Maven
4. PostgreSQL

## API Documentation
| Module Name | Path                  | HTTP Method | Function          |
| ----------- | --------------------- | ----------- | ----------------- |
| User        | /api/rest/v1/register | POST        | for register user |

## Request and Response Data
**Register User**
*Request*
```
[
   {
    "username":"Minato",
    "password":"abcd1234",
    "verifyPassword":"abcd1234",
    "type":"fulltime",
    "url":"https://jobs.github.com/positions/adc996fe-5e04-40ec-bb50-45f4059f0de6",
    "company":"One Punch",
    "company_url":"http://abcdefg.com",
    "location":"Jakarta",
    "title":"Software Engineer",
    "description": "<h1>About role</h1>\n<p> feeling is mutual.</p>\n",
    "how_to_apply": "<p>email  <a href=\"mailto:dan@heywelcome.com\">/a> </p>\n",
    "company_logo": "https://jobs.github.com/rails/active_storage/blobs/en%20Avatar.png"
  }
]
```
*Response*
```
{
    "id": "6e20c5fa-e9b3-4794-8c42-943fbc752540",
    "created_at": "06-01-2021 20:19:46",
    "type": "FULLTIME",
    "url": "https://jobs.github.com/positions/adc996fe-5e04-40ec-bb50-45f4059f0de6",
    "company": "One Punch",
    "company_url": "http://abcdefg.com",
    "location": "Jakarta",
    "title": "Software Engineer",
    "description": "<h1>About role</h1>\n<p> feeling is mutual.</p>\n",
    "how_to_apply": "<p>email  <a href=\"mailto:dan@heywelcome.com\">/a> </p>\n",
    "company_logo": "https://jobs.github.com/rails/active_storage/blobs/en%20Avatar.png"
}
```

## How to use it ?
1. First clone this repository 
      - git clone https://github.com/initializrc/test-dansmultipro.git
   
2. Open your IDE
3. Wait a minutes because it will take a time
4. If it's finished then run this project and test it
