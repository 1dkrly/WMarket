<!DOCTYPE html>
<html>
<head>
    <title>WMarket</title>
</head>
<body>
<header>
    <h1>Welcome to WMarket</h1>
</header>
<nav>
    <ul>
        <li><a href="#">Home</a></li>
        <li><a href="#">Products</a></li>
        <li><a href="#">Contact Us</a></li>
    </ul>
</nav>
    <h2>Our Products</h2>
    <#list products as product>
    <div class="product">
        <h3>${product.title}</h3>
        <p>${product.brand}</p>
        <p>${product.price} ₽</p>
        <a href="/product/${product.id}">Подробнее</a>
    </div>
    </#list>
</body>
</html>
