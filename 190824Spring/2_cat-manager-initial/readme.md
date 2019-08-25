# Zadanie Spring

TO DO:
- [ ] Dodajemy zależności springowe
```
    compile group: 'org.springframework', name: 'spring-context', version: '5.1.7.RELEASE'

    testCompile group: 'org.springframework', name: 'spring-test', version: '5.1.7.RELEASE'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.4.2'
    testCompile group: 'org.assertj', name: 'assertj-core', version: '3.12.2'
```
- [ ] Konfigurujemy context XML oraz beany w beans.xml
    * Wszystkie beany powinny być typu `singleton` z wyjątkiem klasy `Cat`


- [ ] Konfigurujemy context z adnotacjami i bez pliku beans.xml
    * Dodajemy `@Component` i `@Autowired`


- [ ] Tworzmy @Bean w klasie @Configuration
 i wstrzyknąć do bean typu Random do KitchenService.
 Poprawiamy metode losowania jedzenia.(Nie powinna przyjmować żadnego argumentu)


- [ ] Dopisujemy test na context Springa.
 Wykorzystujemy @ContextConfiguration(classes = Main.class)
 oraz implements ApplicationContextAware