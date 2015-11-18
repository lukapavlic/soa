Spletna storitev (Kalkulator.java) je pripravljena na objavo na strežniku WildFly (testirano na ver 8.1 in 9).
Projekt je tipa "Dynamic Web Project" -> rezultat je datoteka .WAR.
Poleg oznak JAX-WS (@WebService ipd.) dodatno registriranje spletne storitve ni potrebno.
 
Generiran odjemalec se nahaja v paketu si.um.feri.gen, uporaba v razredu Odjemalec.java.

Spletna storitev je zavarovana z uporabo WS-Security.
Za veè informacij glejte: https://docs.jboss.org/author/display/WFLY8/WS-Security