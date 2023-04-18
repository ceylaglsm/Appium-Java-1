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
  Scenario:
    Given uygulamanin acildigi kontrol edilir
    Given Uygulamanin basliginin "" oldugu kontrol edilir
    When Tablerden "App" tabine tiklanir
    When Tablerden "Action Bar" tabine tiklanir
    When Tablerden "Action Bar Usage" tabine tiklanir
    When Search butonuna tiklanir
    When Search alanina "gulsum" yazilir
    Then Text Area "gulsum" iceriyor mu kontrol edilir







