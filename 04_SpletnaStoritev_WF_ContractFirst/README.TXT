Spletna storitev (Kalkulator.java) je pripravljena na objavo na strežniku WildFly (testirano na ver 8.1, 9, 10 in 10.1).

Testirano tudi na GlassFish 4.1

Projekt je tipa "Dynamic Web Project" -> rezultat je datoteka .WAR.

Spletna storitev je narejena na osnovi WSDL dokumenta:
wsimport -keep -p si.um.feri.gen KalkulatorService.wsdl
