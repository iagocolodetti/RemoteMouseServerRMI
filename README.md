[Descrição](https://github.com/iagocolodetti/RemoteMouseServerRMI/blob/master/README.md#descri%C3%A7%C3%A3o "Descrição")
<br>
[Downloads](https://github.com/iagocolodetti/RemoteMouseServerRMI/blob/master/README.md#downloads "Downloads")
<br>
[Sobre](https://github.com/iagocolodetti/RemoteMouseServerRMI/blob/master/README.md#sobre "Sobre")
<br>
[Requisitos mínimos](https://github.com/iagocolodetti/RemoteMouseServerRMI/blob/master/README.md#requisitos "Requisitos mínimos")
<br>
[Projeto](https://github.com/iagocolodetti/RemoteMouseServerRMI/blob/master/README.md#projeto "Projeto")
<br>
<br>
# Descrição
Projeto desenvolvido com o único objetivo de controlar remotamente as ações do mouse de um PC utilizando um Smartphone Android.
<br>
<br>
# Downloads
https://github.com/iagocolodetti/RemoteMouseServerRMI/releases
* [RemoteMouseServer.zip](https://github.com/iagocolodetti/RemoteMouseServerRMI/releases/download/v1.0/RemoteMouseServer.zip "RemoteMouseServer.zip")
* [Código-fonte](https://github.com/iagocolodetti/RemoteMouseServerRMI/archive/v1.0.zip "v1.0.zip")
* [Cliente](https://github.com/iagocolodetti/RemoteMouseClientRMI/blob/master/README.md#downloads "RemoteMouseClientRMI#Downloads")
# Sobre
Aplicação servidora (PC) para disponibilização do serviço. Ao iniciar o app e ligar o serviço, a parte cliente da aplicação (Android) deverá ser capaz de controlar as ações do mouse remotamente.
<br>
<br>
<img src="https://github.com/iagocolodetti/imagens/blob/master/rmsrmi1.png" alt="RemoteMouseServer OFF">
<img src="https://github.com/iagocolodetti/imagens/blob/master/rmsrmi2.png" alt="RemoteMouseServer ON">
<br>
<br>
# Requisitos
Uso/instalação do [Java Runtime Environment (JRE)](https://www.java.com/pt_BR/download "Java Runtime Environment (JRE)").
<br>
A pasta "lib" que contém a biblioteca lipermi, deve estar no mesmo diretório que a aplicação.
<br>
O servidor (PC) deve estar conectado a mesma rede que o cliente (Android).
<br>
A porta selecionada deverá estar aberta/liberada localmente.
<br>
<br>
# Projeto
Desenvolvido no NetBeans IDE 8.2 fazendo uso de RMI e Thread, porém como não há Java RMI nativamente para Android, foi necessário o uso da biblioteca [LipeRMI](http://lipermi.sourceforge.net "LipeRMI") em ambos os lados (Servidor e Cliente).
