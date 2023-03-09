Необходимо реализовать консольное CRUD приложение, которое взаимодействует </br>
с БД и позволяет выполнять все CRUD операции над сущностями:</br>
Developer (id, firstName, lastName, List<Skill> skills, Specialty specialty)</br>
Skill</br>
Specialty</br>
Status (enum ACTIVE, DELETED)</br>
Требования:</br>
Придерживаться шаблона MVC (пакеты model, repository, service, controller, view)</br>
Для миграции БД использовать https://www.liquibase.org/ </br>
Сервисный слой приложения должен быть покрыт юнит тестами (junit + mockito).</br>
Слои:</br>
model - POJO клаcсы</br>
repository - классы, реализующие доступ к БД</br>
controller - обработка запросов от пользователя</br>
view - все данные, необходимые для работы с консолью</br>
</br>
Например: Developer, DeveloperRepository, DeveloperController, DeveloperView и т.д.</br>
</br>
Для репозиторного слоя желательно использовать базовый интерфейс:</br>
interface GenericRepository<T,ID></br>
</br>
interface DeveloperRepository extends GenericRepository<Developer, Long></br>
</br>
class JdbcDeveloperRepositoryImpl implements DeveloperRepository</br>
</br>
Для импорта библиотек использовать Maven</br>
Результатом выполнения проекта должен быть отдельный репозиторий на github,</br> 
с описанием задачи, проекта и инструкцией по локальному запуску проекта.</br>
</br>
Технологии: Java, MySQL, JDBC, Maven, Liquibase, JUnit, Mockito</br>
