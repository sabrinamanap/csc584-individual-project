<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Your Cute Profile Summary 🌸</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>

<div class="container">

    <h1>Your Cute Profile Summary 🌸</h1>

    <div class="box">
        <h2>Personal Info 💕</h2>

        <p><b>Name:</b> ${fullname}</p>
        <p><b>Age:</b> ${age}</p>
        <p><b>Birth Date:</b> ${birthdate}</p>
        <p><b>Hobby:</b> ${hobby}</p>
        <p><b>About Hobby:</b> ${hobbyDesc}</p>
        <p><b>Self Introduction:</b> ${selfIntro}</p>
    </div>

    <div class="box">
        <h2>Academic Info 🎀</h2>

        <p><b>Student ID:</b> ${studentID}</p>
        <p><b>Personal Email:</b> ${personalEmail}</p>
        <p><b>Student Email:</b> ${studentEmail}</p>
        <p><b>Faculty:</b> ${faculty}</p>
        <p><b>Course:</b> ${course}</p>
        <p><b>Semester:</b> ${semester}</p>
    </div>

</div>

</body>
</html>
