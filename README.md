# MultiPlugins-SQLConnector
MySQL Integration in your Plugin

1.) Du downloadest dir die Jar Datei hier!

2.) Du importierst die Jar Datei in deiner IDE

3.) Du musst eine Connection herstellen in deinem Plugin:

private SQL sql = new SQL("HOST", PORT, "DATABASE", "USER", "PASSWORD")

4.) Du erstellst dir ein Table

ALL VALUES (int, varchar und vieles weitere)
MySQL.getInstance().createTable("Coins", "COINS int");

5.) Dann kannst du anfangen mit deinem Plugin

