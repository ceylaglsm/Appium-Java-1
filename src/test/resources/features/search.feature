@SearchPage
Feature: Google Search Page


  @Ornek1
  Scenario:  Find Element
    Given uygulamanin acildigi kontrol edilir

  @Ornek2
  Scenario: Get Text
    Given Uygulamanin basliginin "" oldugu kontrol edilir

  @Ornek3
  Scenario:
    Given uygulamanin acildigi kontrol edilir
    Given Uygulamanin basliginin "" oldugu kontrol edilir
    When Tablerden App tabine basilir

  @Ornek4
  Scenario:
    Given uygulamanin acildigi kontrol edilir
    Given Uygulamanin basliginin "" oldugu kontrol edilir
    When Tablerden App tabine basilir
    When Tablerden ActionBar tabine tiklanir
    When Tablerden ActionBarUsage tabine tiklanir
    When Search butonuna tiklanir
    When Search alanina "gulsum" yazilir
    Then Text Area "gulsum" iceriyor mu kontrol edilir

  @Ornek5
  Scenario Outline:SendKeys
    Given uygulamanin acildigi kontrol edilir
    Given Uygulamanin basliginin "" oldugu kontrol edilir
    When Tablerden "<tab1>" tabine tiklanir
    When Tablerden "<tab2>" tabine tiklanir
    When Tablerden "<tab3>" tabine tiklanir
    When Search butonuna tiklanir
    When Search alanina "<text>" yazilir
    Then Text Area "<text>" iceriyor mu kontrol edilir
    Examples:
      | tab1 | tab2       | tab3             | text   |
      | App  | Action Bar | Action Bar Usage | gulsum |
      | App  | Action Bar | Action Bar Usage | uslu   |
      | App  | Action Bar | Action Bar Usage | QA     |


    @Ornek6
    Scenario: Scroll Ui selector/Ui scrollable
      When Tablerden Graphics tabine tiklanir
      When Tablerden Touch Paint tabine tiklanir

  @Ornek7
  Scenario: Scroll Ui selector/Ui scrollable
    When Tablerden Graphics tabine tiklanir
    When Tablerden ikinci.defa Touch Paint tabine tiklanir










