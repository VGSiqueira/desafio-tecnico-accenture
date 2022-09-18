Feature: Seguros de automóveis

  Scenario: Aplicação de seguro de automóveis sucedida
    Given usuário está na página de aplicação de seguro de automóveis
    When preencher o formulário na aba Enter Vehicle Data e pressionar next
    And preencher o formulário na aba Enter Insurant Data e pressionar next
    And preencher o formulário na aba Enter Product Data e pressionar next
    And preencher o formulário na aba Select Price Option e pressionar next
    And preencher o formulário na aba Send Quote tab e pressionar send
    Then verificar a mensagem Sending e-mail success! na tela
