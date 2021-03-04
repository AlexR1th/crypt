<#import "/spring.ftl" as spring/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
    <link type="text/css" href="/css/style.css" rel="stylesheet">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h1 class="text">Hello FORM</h1>
<form class="form" method="post" style="padding-bottom: 50px">

    key:<@spring.formInput  "form.key" "" "number"/>
    <@spring.formInput  "form.text" "" "text"/>
    <button type="submit">pokay</button>
</form>
<div class="cryptText">
    <h3>Crypted Text</h3>
    <p style="border: solid red 2px">
    ${form.cryptedText}
    </p>
</div>

</body>
</html>