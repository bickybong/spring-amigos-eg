const express = require("express");
const app = express();

//main page
app.get("/", function(req, res){
    res.send("<h1>Hello World</h1>");
    console.log(req);
});

//contact page
app.get("/contact", function(req, res){
    res.send("Contact me at: zephan@gmail.com")
})

//about page
app.get("/about", function(req, res){
    res.send("My name is Zephan Wong, I love exercise and coding!")
})

app.get("/hobbies", function(req, res){
    res.send("<ul><li>Gyming</li><li>Meditating</li></ul>")
})

app.listen(3000, function () {
    console.log("server started on port 3000");
});

