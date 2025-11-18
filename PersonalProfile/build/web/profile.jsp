<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>Profile Result</title>
  <link rel="stylesheet" href="css/style.css" />
</head>
<body>
  <div class="card result">
    <h1>✨ Profile Preview</h1>

    <div class="row"><strong>Name:</strong> ${name}</div>
    <div class="row"><strong>Student ID:</strong> ${studentId}</div>
    <div class="row"><strong>Program:</strong> ${program}</div>
    <div class="row"><strong>Email:</strong> ${email}</div>
    <div class="row"><strong>Hobbies:</strong> ${hobbies}</div>

    <div class="intro-box">
      <h3>About me</h3>
      <p>${intro}</p>
    </div>

    <a href="index.html" class="btn">Edit</a>
  </div>
</body>
</html>
