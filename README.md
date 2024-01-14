# LR3 REST
## SpringREST vs JAX-RS
JAX-RS является спецификацией Java EE для создания RESTful-сервисов.

Spring охватывает широкий спектр функциональностей за пределами RESTful-сервисов, такие как,
функции вроде внедрения зависимостей, Spring AOP и более широкого набора интеграций (например, Spring Data, Spring Security).

В ходе работы выбор пал на SpringREST, т.к для разработки за основу было взято приложение ЛР 2, основанное на Spring с изменённой конфигурацией и реализован REST API для моделей из прошлой работы.

## Ход работы
Были заменены репозитории на Spring DATA JPA.

Реализованы рест-контроллеры рассшрены до форматов данных JSON, XML. Была реализова XSL трансформация, добавлены шаблоны XSLT [/api](https://github.com/badasqi/ESA_REST/tree/main/src/main/java/com/example/esalab3/controller/restcontroller), 
[resourses/xslt/](https://github.com/badasqi/ESA_REST/tree/main/src/main/resources/xslt), 

JSP страницы заменен на HTML [resourses/templates/](https://github.com/badasqi/ESA_REST/tree/main/src/main/resources/templates)


