
<h1>🎓 Web Service for Online Shop</h1>

<div class="section">
    <h2>📌 Описание проекта</h2>
    <p>Данный проект представляет собой <strong>RESTful веб-сервис</strong> для управления интернет-магазином, созданный в рамках учебной программы.<br>
        Реализован с использованием <strong>Java 17</strong>, <strong>Spring Boot</strong>, <strong>Maven</strong>, <strong>PostgreSQL</strong> и включает современные практики разработки: валидацию, логирование, асинхронность, кэширование, CI/CD и UI.</p>
</div>

---

## 🚀 Функциональные возможности

### 🛍 Управление товарами
- 🔹 **Добавление товара** (название, цена, количество, описание)  
- 🔹 **Удаление товара**  
- 🔹 **Редактирование информации о товаре**  
- 🔹 **Просмотр списка всех товаров**  
- 🔹 **Фильтрация и поиск товаров по параметрам**  

### 📦 Управление заказами
- 🔹 **Создание заказа** (список товаров, пользователь, статус)  
- 🔹 **Отслеживание статуса заказа** (в обработке, отправлен, доставлен)  
- 🔹 **Отмена заказа**  

### 👤 Пользователи и авторизация
- 🔹 **Регистрация пользователей**  
- 🔹 **Авторизация (JWT-токен)**  
- 🔹 **Роли пользователей (администратор, покупатель, менеджер)**  

### 💰 Финансы и отчетность
- 🔹 **Подсчет общей суммы заказов**  
- 🔹 **Отчеты по продажам**  
- 🔹 **Фильтрация заказов по дате, статусу, клиенту**  

### 🔗 REST API
- 🔹 Поддержка **GET, POST, PUT, DELETE** запросов  
- 🔹 Возвращает данные в формате **JSON**  
- 🔹 Работает на **Spring Boot 3.4.3**  

---


<div class="section">
    <h2>📂 Структура проекта</h2>
    <pre><code>unishop/
├── src/
│   ├── main/
│   │   ├── java/com/university/shop/
│   │   │   ├── controllers/       # REST-контроллеры
│   │   │   ├── services/          # Бизнес-логика
│   │   │   ├── models/            # Сущности: Product, Order, User, Category
│   │   │   ├── repositories/      # Интерфейсы JPA
│   │   │   ├── cache/             # In-memory кэш
│   │   │   ├── logging/           # Логика логирования и аспектов
│   │   │   ├── config/            # Swagger, Docker и пр.
│   │   │   └── ShopApplication.java  # Точка входа
│   ├── resources/
│   │   └── application.properties  # Конфигурация БД и пр.
├── test/                     # Unit-тесты
├── Dockerfile
├── docker-compose.yml
├── pom.xml                  # Maven зависимости
├── checkstyle.xml          # Стиль кода
└── README.md
</code></pre>
</div>

<div class="section">
    <h2>📦 Технологии и инструменты</h2>
    <ul>
        <li><strong>Java 17</strong>, <strong>Spring Boot 3.4.3</strong>, <strong>Maven</strong></li>
        <li><strong>PostgreSQL/MySQL</strong>, JPA, Hibernate</li>
        <li>Swagger, MapStruct, Lombok</li>
        <li>React / Angular / Spring MVC</li>
        <li>Docker, GitHub Actions, Render/Railway</li>
        <li>CheckStyle, JMeter, Postman</li>
        <li>JUnit, Mockito</li>
    </ul>
</div>

<div class="section">
    <h2>🏁 Как запустить проект</h2>
    <h3>Через Maven:</h3>
    <pre><code># Клонируйте репозиторий
git clone https://github.com/yourusername/unishop.git
cd unishop

# Соберите проект
./mvnw clean install

# Запустите приложение
./mvnw spring-boot:run</code></pre>

</div>

</body>
</html>
