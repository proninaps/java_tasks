<!DOCTYPE html>
<html xmlns="http://www.w3.org/2000/xhtml" xmlns:th="http://www.thymeleaf.org">

<head>
    <title>SALAD</title>
    <link rel="stylesheet" th:href="@{/styles.css}"/>
    <style>

    .img-responsive
    {
    max-width: 100%;
    height: auto;
    }
	</style>
</head>

<body>
    <h1>Design Your SALAD</h1>
    <img img src=/img/SALAD.jpg/ class="img-responsive" />

    <form th:object="${salad}" method="post">
        <span class="validationError"
        th:if="${#fields.hasErrors('ingredients')}"
        th:errors="*{ingredients}">Ingredient Error</span>

        <div class="grid">
            <div class="ingredient-group" id="wraps">
                <h3>Pick Your WRAP</h3>
                <div th:each="ingredient : ${wrap}">
                    <input type="checkbox" th:field="*{ingredients}" th:value="${ingredient.id}"/>
                    <span th:text="${ingredient.name}">INGREDIENT</span><br/>
                </div>
            </div>
            <div class="ingredient-group" id="proteins">
                <h3>Pick Your Protein</h3>
                <div th:each="ingredient : ${protein}">
                    <input type="checkbox" th:field="*{ingredients}" th:value="${ingredient.id}"/>
                    <span th:text="${ingredient.name}">INGREDIENT</span><br/>
                </div>
            </div>
            <div class="ingredient-group" id="veggies">
                <h3>Pick Your Veggies</h3>
                <div th:each="ingredient : ${veggies}">
                    <input type="checkbox" th:field="*{ingredients}" th:value="${ingredient.id}"/>
                    <span th:text="${ingredient.name}">INGREDIENT</span><br/>
                </div>
            </div>
            <input type="text" th:field="*{name}">
            <button>Создай Салат</button>
        </div>
    </form>
</body>

</html>