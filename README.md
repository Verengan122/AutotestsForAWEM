# Проект по автоматизации тестирования awem.com
<a href="https://awem.com/"><img width="100%" title="AWEM" src="images/logo/Awem_logo.png"></a>

## :scroll: Структура:

- <a href="#toolbox-Стек">Стек</a>
- <a href="#arrow_forward-Автотесты">Автотесты</a>
- <a href="#bar_chart-сборка-в-Jenkins">Сборка в Jenkins</a>
- <a href="#outbox_tray-запуск-из-терминала">Запуск из терминала</a>
- <a href="#loudspeaker-allure-отчет">Allure отчет</a>
- <a href="#ticket-Интеграция-с-Allure-TestOps">Интеграция с Allure TestOps</a>
- <a href="#robot-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#film_strip-видео-примеры-прохождения-тестов">Видео примеры прохождения тестов</a>



## :toolbox: Стек:
<p align="center">
<img width="10%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="10%" title="Java" src="images/logo/Java.svg">
<img width="10%" title="Gradle" src="images/logo/Gradle.svg">
<img width="10%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="10%" title="Selenide" src="images/logo/Selenide.svg">
<img width="10%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="10%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="10%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="10%" title="GitHub" src="images/logo/GitHub.svg">
<img width="10%" title="Telegram" src="images/logo/Telegram.svg">

</p>


## :arrow_forward: Автотесты
- Проверка наличия Title (работоспособность главной страницы)
- Проверка возомжности смены языка
- Проверка наличия игры Cradle of Empires по влкаде "Игры"
- Проверка журнала консоли на наличие ошибок
- Проверка наличия вакансии на сайте

## :bar_chart: Сборка в Jenkins
## <a target="_blank" href="https://jenkins.autotests.cloud/job/AWEM_Tests_QA_Guru_11_Diploma/">Сборка в Jenkins</a>
<p align="center">
<img title="Jenkins Dashboard" src="images/screenshots/jenkins_pr.png">
</p>

## :hammer_and_wrench: Параметры сборки в Jenkins:

- repository (возможность сборки со своим репозиторием)
- browser (браузер, по умолчанию chrome)
- version (версия браузера, по умолчанию 100.0)
- size (размер окна браузера, по умолчанию 1920x1080)
- remoteUrl (адрес удаленного сервера selenoid)
- threads (количество потоков, по умолчанию 1)
- allure notification version (выбор версии Allure Notification, по умолчанию 2.2.3)

## :outbox_tray: Запуск из терминала
Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
gradle
clean
test
-Dtype=remote
```
## :loudspeaker: Allure отчет
- ### Главный экран отчета
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure-report.png">
</p>

- ### :clipboard: Страница с проведенными тестами
<p align="center">
<img title="Allure Test Page" src="images/screenshots/pages_tests.png">
</p>

## :ticket: Интеграция с Allure TestOps
- ### Экран с результатами запуска тестов
<p align="center">
<img title="TestOps Launch Page" src="images/screenshots/Alure.png">
</p>

- ### Страница с тестами в TestOps
<p align="center">
<img title="TestOps tests page" src="images/screenshots/TestOpsPageTests.png">
</p>

## :robot: Отчет в Telegram
<p align="center">
<img title="Telegram notification message" src="images/screenshots/telegram.png">
</p>

## :film_strip: Видео примеры прохождения тестов
> К каждому тесту из отчёта прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gif/779a2f71eef66db9.gif">
</p>