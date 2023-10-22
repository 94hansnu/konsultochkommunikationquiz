package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Fråga 1
        System.out.println("\nFråga 1: Vad är självledarskap?");
        System.out.println("a) Att ledas av andra personer");
        System.out.println("b) Att ta ansvar för att leda sig själv och sina handlingar");
        System.out.println("c) Att följa instruktioner från överordnade");
        String answer1 = scanner.nextLine();
        if (answer1.equals("b")) {
            score++;
        }

        // Fråga 2
        System.out.println("\nFråga 2: Vad är värderingar i självkännedomssammanhang?");
        System.out.println("a) En form av valuta");
        System.out.println("b) Det som hjälper dig att avgöra rätt eller fel och hur man bör agera i olika situationer");
        System.out.println("c) En typ av mål");
        String answer2 = scanner.nextLine();
        if (answer2.equals("b")) {
            score++;
        }

        // Fråga 3
        System.out.println("\nFråga 3: Vad är målet med självkännedom?");
        System.out.println("a) Att aldrig göra fel");
        System.out.println("b) Att förstå sig själv bättre, identifiera styrkor och svagheter och arbeta mot personlig utveckling");
        System.out.println("c) Att vinna i alla situationer");
        String answer3 = scanner.nextLine();
        if (answer3.equals("b")) {
            score++;
        }

        // Fråga 4
        System.out.println("\nFråga 4: Vad är skillnaden mellan ett 'growth mindset' och ett 'fixed mindset'?");
        System.out.println("a) Ett 'growth mindset' innebär att man är negativ och ett 'fixed mindset' innebär att man är positiv.");
        System.out.println("b) Ett 'growth mindset' innebär att man är öppen för utmaningar och förslag, medan ett 'fixed mindset' innebär att man är fyrkantig och negativ.");
        System.out.println("c) Ett 'growth mindset' och ett 'fixed mindset' är samma sak.");
        String answer4 = scanner.nextLine();
        if (answer4.equals("b")) {
            score++;
        }

        // Fråga 5
        System.out.println("\nFråga 5: Vad är syftet med att vara medveten om dina styrkor och svagheter?");
        System.out.println("a) Att eliminera alla svagheter och bli perfekt.");
        System.out.println("b) Att vara ärlig om dina svagheter och förstå hur de påverkar dig och andra.");
        System.out.println("c) Att dölja dina svagheter och fokusera enbart på dina styrkor.");
        String answer5 = scanner.nextLine();
        if (answer5.equals("b")) {
            score++;
        }

        // Fråga 6
        System.out.println("\nFråga 6: Vad är motivation 3.0 och vilka är dess inre drivkrafter?");
        System.out.println("a) Motivation 3.0 är att vara motiverad av yttre faktorer som lön och belöningar.");
        System.out.println("b) Motivation 3.0 är att vara motiverad av inre drivkrafter, inklusive kompetens, autonomi och syfte.");
        System.out.println("c) Motivation 3.0 är att vara helt ointresserad av att arbeta.");
        String answer6 = scanner.nextLine();
        if (answer6.equals("b")) {
            score++;
        }

        // Fråga 7
        System.out.println("\nFråga 7: Hur påverkar värderingar vårt beteende och prioriteringar?");
        System.out.println("a) Värderingar har ingen påverkan på vårt beteende eller prioriteringar.");
        System.out.println("b) Värderingar påverkar vårt beteende, våra prioriteringar och vår attityd.");
        System.out.println("c) Värderingar påverkar enbart vår etik, inte vår moral.");
        String answer7 = scanner.nextLine();
        if (answer7.equals("b")) {
            score++;
        }
        // Fråga 8
        System.out.println("\nFråga 8: Vilka tre huvudkomponenter utgör vinnande kommunikation enligt texten?");
        System.out.println("a) Ord, ljud och bilder.");
        System.out.println("b) Ord, ljud och kroppsspråk.");
        System.out.println("c) Bilder, ljud och kroppsspråk.");
        String answer8 = scanner.nextLine();
        if (answer8.equals("b")) {
            score++;
        }

        // Fråga 9
        System.out.println("\nFråga 9: Vilka procentuella andelar av kommunikationen representerar ord, ljud och kroppsspråk enligt texten?");
        System.out.println("a) Ord 10%, ljud 40%, kropp 50%.");
        System.out.println("b) Ord 15%, ljud 30%, kropp 55%.");
        System.out.println("c) Ord 25%, ljud 25%, kropp 50%.");
        String answer9 = scanner.nextLine();
        if (answer9.equals("b")) {
            score++;
        }

        // Fråga 10
        System.out.println("\nFråga 10: Vilket är det första steget i förberedelse för vinnande kommunikation enligt texten?");
        System.out.println("a) Skapa presentationen.");
        System.out.println("b) Samla material och information.");
        System.out.println("c) Tänka på vad du vill uppnå med presentationen.");
        String answer10 = scanner.nextLine();
        if (answer10.equals("c")) {
            score++;
        }

        // Fråga 11
        System.out.println("\nFråga 11: Varför är det viktigt att veta vad du vill uppnå med din presentation?");
        System.out.println("a) Det är inte viktigt, du kan prata om vad som helst.");
        System.out.println("b) Det hjälper dig att fokusera din presentation och kommunicera ditt budskap effektivt.");
        System.out.println("c) Det gör att du kan prata längre och fylla tiden.");
        String answer11 = scanner.nextLine();
        if (answer11.equals("b")) {
            score++;
        }
        // Fråga 12
        System.out.println("\nFråga 12: Vad är det första steget i att bygga en presentation enligt texten?");
        System.out.println("a) Skapa en sammanfattning.");
        System.out.println("b) Tala om det mest intressanta först.");
        System.out.println("c) Avsluta med en fråga.");
        String answer12 = scanner.nextLine();
        if (answer12.equals("b")) {
            score++;
        }

        // Fråga 13
        System.out.println("\nFråga 13: Varför bör du inte avsluta presentationen med en fråga enligt texten?");
        System.out.println("a) Det är ett bra sätt att engagera publiken.");
        System.out.println("b) Publiken kommer att komma ihåg frågan bäst.");
        System.out.println("c) Det är bättre att avsluta med en sammanfattning för att förstärka budskapet.");
        String answer13 = scanner.nextLine();
        if (answer13.equals("c")) {
            score++;
        }

        // Fråga 14
        System.out.println("\nFråga 14: Vad representerar Aristoteles retoriska triangel i presentationssammanhang?");
        System.out.println("a) En geometrisk form som används i presentationer.");
        System.out.println("b) Tre olika typer av publikens reaktioner på en presentation.");
        System.out.println("c) Tre viktiga element i en lyckad presentation: ethos, pathos och logos.");
        String answer14 = scanner.nextLine();
        if (answer14.equals("c")) {
            score++;
        }

        // Fråga 15
        System.out.println("\nFråga 15: Vad är syftet med ethos enligt Aristoteles retoriska triangel?");
        System.out.println("a) Att skapa känsla och engagemang hos publiken.");
        System.out.println("b) Att förmedla logiskt tänkande och fakta.");
        System.out.println("c) Att etablera trovärdighet och visa att du har kunskap om ämnet.");
        String answer15 = scanner.nextLine();
        if (answer15.equals("c")) {
            score++;
        }
// Fråga 16
        System.out.println("\nFråga 16: Enligt texten, hur många gånger bör du köra igenom din presentation som en del av repetitionen?");
        System.out.println("a) En gång är tillräckligt.");
        System.out.println("b) Minst två gånger.");
        System.out.println("c) Fyra gånger.");
        String answer16 = scanner.nextLine();
        if (answer16.equals("c")) {
            score++;
        }

        // Fråga 17
        System.out.println("\nFråga 17: Vad är syftet med att inte förlita sig på ett manus vid presentationen?");
        System.out.println("a) Manus ger presentationen en mer formell känsla.");
        System.out.println("b) Att minska behovet av manus hjälper dig att vara mer flexibel och interagera bättre med publiken.");
        System.out.println("c) Manus gör det enklare att komma ihåg vad du ska säga.");
        String answer17 = scanner.nextLine();
        if (answer17.equals("b")) {
            score++;
        }

        // Fråga 18
        System.out.println("\nFråga 18: Enligt texten, vad är fördelen med att använda en 'phrase-a-line' vid presentationen?");
        System.out.println("a) Det gör presentationen kortare och mer koncis.");
        System.out.println("b) Det gör det enklare att följa manuset exakt.");
        System.out.println("c) Det hjälper dig att hålla punkter och prata fritt, vilket gör presentationen mer engagerande.");
        String answer18 = scanner.nextLine();
        if (answer18.equals("c")) {
            score++;
        }
// Fråga 19
        System.out.println("\nFråga 19: Varför är det viktigt att undvika att använda för mycket specialistterminologi i en presentation?");
        System.out.println("a) Specialisterminologi gör presentationen mer imponerande och professionell.");
        System.out.println("b) För mycket specialistterminologi kan göra presentationen svår att förstå för publiken.");
        System.out.println("c) Specialistterminologi är alltid nödvändig för att visa din expertis.");
        String answer19 = scanner.nextLine();
        if (answer19.equals("b")) {
            score++;
        }

        // Fråga 20
        System.out.println("\nFråga 20: Varför är tydlig artikulation viktig, särskilt under distanspresentationer?");
        System.out.println("a) Tydlig artikulation är inte viktig eftersom deltagarna oftast inte bryr sig om uttal.");
        System.out.println("b) Tydlig artikulation är viktig eftersom det gör presentationen mer imponerande.");
        System.out.println("c) Tydlig artikulation är viktig eftersom det hjälper till att säkerställa att alla deltagare förstår innehållet korrekt.");
        String answer20 = scanner.nextLine();
        if (answer20.equals("c")) {
            score++;
        }

        // Fråga 21
        System.out.println("\nFråga 21: Vad kan hända om en presentation är för teknisk och går över publiken?");
        System.out.println("a) Publiken kommer att älska presentationen och tycka att den är mycket informativ.");
        System.out.println("b) Publiken kan förlora intresse och har svårt att följa med.");
        System.out.println("c) En teknisk presentation är alltid mer framgångsrik än en enkel en.");
        String answer21 = scanner.nextLine();
        if (answer21.equals("b")) {
            score++;
        }
// Fråga 22
        System.out.println("\nFråga 22: Vad är en anafor i retorik?");
        System.out.println("a) En retorisk fråga som kräver ett kort svar.");
        System.out.println("b) En retorisk figur där flera satser börjar med samma ord eller fras.");
        System.out.println("c) En retorisk figur där flera satser avslutas med samma ord.");
        String answer22 = scanner.nextLine();
        if (answer22.equals("b")) {
            score++;
        }

        // Fråga 23
        System.out.println("\nFråga 23: Vad är emfas när det gäller rösten vid en presentation?");
        System.out.println("a) Att variera röstens tonhöjd och hastighet.");
        System.out.println("b) Att använda många retoriska frågor.");
        System.out.println("c) Att tala mycket tyst.");
        String answer23 = scanner.nextLine();
        if (answer23.equals("a")) {
            score++;
        }

        // Fråga 24
        System.out.println("\nFråga 24: Varför är ögonkontakt viktigt i presentationer?");
        System.out.println("a) Ögonkontakt är inte viktigt i presentationer.");
        System.out.println("b) Ögonkontakt visar att du inte är nervös.");
        System.out.println("c) Ögonkontakt skapar en koppling med din publik och visar att du är engagerad.");
        String answer24 = scanner.nextLine();
        if (answer24.equals("c")) {
            score++;
        }

        // Fråga 25
        System.out.println("\nFråga 25: Vad är en metafor i retorik?");
        System.out.println("a) En retorisk fråga som används för att kräva en kort respons.");
        System.out.println("b) En retorisk figur som skapar bilder genom att använda exempel.");
        System.out.println("c) En retorisk teknik där flera satser börjar med samma ord.");
        String answer25 = scanner.nextLine();
        if (answer25.equals("b")) {
            score++;
        }
// Fråga 26
        System.out.println("\nFråga 26: Vad är ett exempel på en semantiskt hinder i kommunikation?");
        System.out.println("a) Att tala för fort under en presentation.");
        System.out.println("b) Att använda tekniska termer som inte förstås av mottagaren.");
        System.out.println("c) Att vara nervös inför att tala inför publik.");
        String answer26 = scanner.nextLine();
        if (answer26.equals("b")) {
            score++;
        }

        // Fråga 27
        System.out.println("\nFråga 27: Vad är ett exempel på ett psykologiskt hinder i kommunikation?");
        System.out.println("a) Att ha dålig belysning under en presentation.");
        System.out.println("b) Att vara stressad och nervös vid en presentation.");
        System.out.println("c) Att inte ha den senaste tekniken för presentationer.");
        String answer27 = scanner.nextLine();
        if (answer27.equals("b")) {
            score++;
        }

        // Fråga 28
        System.out.println("\nFråga 28: Vad är ett exempel på ett organisatoriskt hinder i kommunikation?");
        System.out.println("a) Att använda tydlig och effektiv kommunikation mellan olika team.");
        System.out.println("b) Att undvika att hålla kommunikationen inom sitt eget team.");
        System.out.println("c) Att ha en väl fungerande uppkoppling under presentationer.");
        String answer28 = scanner.nextLine();
        if (answer28.equals("b")) {
            score++;
        }

        // Fråga 29
        System.out.println("\nFråga 29: Vad är ett exempel på ett personligt hinder i kommunikation?");
        System.out.println("a) Att använda tekniska termer som inte förstås av mottagaren.");
        System.out.println("b) Att vara stressad och nervös vid en presentation.");
        System.out.println("c) Att vara väl förberedd och självsäker i kommunikationen.");
        String answer29 = scanner.nextLine();
        if (answer29.equals("b")) {
            score++;
        }
        // Fråga 30
        System.out.println("\nFråga 30: Vilken färgpersonlighet beskrivs som pålitlig och service-minded?");
        System.out.println("a) Röd");
        System.out.println("b) Blå");
        System.out.println("c) Grön");
        String answer30 = scanner.nextLine();
        if (answer30.equals("c")) {
            score++;
        }

        // Fråga 31
        System.out.println("\nFråga 31: Vilken färgpersonlighet beskrivs som behövande av trygghet och förlorar sällan humöret?");
        System.out.println("a) Gul");
        System.out.println("b) Blå");
        System.out.println("c) Grön");
        String answer31 = scanner.nextLine();
        if (answer31.equals("c")) {
            score++;
        }

        // Fråga 32
        System.out.println("\nFråga 32: Hur bör du börja en konversation med en person som har en Grön personlighet?");
        System.out.println("a) Gå direkt in på den verkliga uppgiften.");
        System.out.println("b) Starta med lite socialt prat innan du går in på den verkliga uppgiften.");
        System.out.println("c) Dominera konversationen för att snabbt nå målet.");
        String answer32 = scanner.nextLine();
        if (answer32.equals("b")) {
            score++;
        }

        // Fråga 33
        System.out.println("\nFråga 33: Vad är viktigast när du kommunicerar med en person med Grön personlighet?");
        System.out.println("a) Att dominera konversationen.");
        System.out.println("b) Att inkludera personen och försäkra dig om att de är med dig i varje steg.");
        System.out.println("c) Att snabbt nå målet och gå vidare.");
        String answer33 = scanner.nextLine();
        if (answer33.equals("b")) {
            score++;
        }
        // Fråga 34
        System.out.println("\nFråga 34: Vilken färgpersonlighet beskrivs som verbal, kommunikativ och full av idéer?");
        System.out.println("a) Röd");
        System.out.println("b) Gul");
        System.out.println("c) Blå");
        String answer34 = scanner.nextLine();
        if (answer34.equals("b")) {
            score++;
        }

        // Fråga 35
        System.out.println("\nFråga 35: Vad är viktigt när du kommunicerar med en person som har en Gul personlighet?");
        System.out.println("a) Avbryta dem och gå direkt till slutsatserna.");
        System.out.println("b) Låta dem prata färdigt och presentera slutsatser snarare än hur du har kommit fram till dem.");
        System.out.println("c) Hålla mötet strukturerat och ordningsamt.");
        String answer35 = scanner.nextLine();
        if (answer35.equals("b")) {
            score++;
        }

        // Fråga 36
        System.out.println("\nFråga 36: Vad är en vanlig egenskap hos personer med en Gul personlighet?");
        System.out.println("a) De har få idéer och möjligheter.");
        System.out.println("b) De är tysta och reserverade.");
        System.out.println("c) De är positiva, entusiastiska och har mycket energi.");
        String answer36 = scanner.nextLine();
        if (answer36.equals("c")) {
            score++;
        }

        // Fråga 37
        System.out.println("\nFråga 37: Vad är en utmaning när du kommunicerar med en person som har en Gul personlighet?");
        System.out.println("a) Att avbryta dem och presentera slutsatser direkt.");
        System.out.println("b) Att låta dem prata färdigt och inte övervälda dem med för mycket information.");
        System.out.println("c) Att vara tyst och reserverad.");
        String answer37 = scanner.nextLine();
        if (answer37.equals("b")) {
            score++;
        }
// Fråga 38
        System.out.println("\nFråga 38: Vilken färgpersonlighet beskrivs som starkt pådrivande kraft, aktiv och målfokuserad?");
        System.out.println("a) Grön");
        System.out.println("b) Röd");
        System.out.println("c) Blå");
        String answer38 = scanner.nextLine();
        if (answer38.equals("b")) {
            score++;
        }

        // Fråga 39
        System.out.println("\nFråga 39: Vad är en typisk egenskap hos personer med en Röd personlighet?");
        System.out.println("a) Kontrollbehov");
        System.out.println("b) Att vara tyst och rastlös.");
        System.out.println("c) Att undvika utmaningar.");
        String answer39 = scanner.nextLine();
        if (answer39.equals("a")) {
            score++;
        }

        // Fråga 40
        System.out.println("\nFråga 40: Vad är en utmaning när du kommunicerar med en person som har en Röd personlighet?");
        System.out.println("a) Att lyssna på dem och fatta beslut snabbt.");
        System.out.println("b) Att inte ge dem utmaningar och att vara oaktiv.");
        System.out.println("c) Att vara rastlös och oavslutad i konversationen.");
        String answer40 = scanner.nextLine();
        if (answer40.equals("a")) {
            score++;
        }

        // Fråga 41
        System.out.println("\nFråga 41: Vad beskriver uttrycket 'Telling rather than selling' i samband med en Röd personlighet?");
        System.out.println("a) Att de älskar att sälja produkter och tjänster.");
        System.out.println("b) Att de är bra på att berätta och förklara saker, och att de inte behöver övertyga andra.");
        System.out.println("c) Att de är blyga och ogillar att tala inför andra.");
        String answer41 = scanner.nextLine();
        if (answer41.equals("b")) {
            score++;
        }
// Fråga 42
        System.out.println("\nFråga 42: När du kommunicerar med en person som har en Röd personlighet, vad är en viktig kommunikationsstrategi?");
        System.out.println("a) Att vara otydlig och inte ha fokus.");
        System.out.println("b) Gå rakt på sak och fokusera på resultatet.");
        System.out.println("c) Använda mycket känslomässig retorik.");
        String answer42 = scanner.nextLine();
        if (answer42.equals("b")) {
            score++;
        }

        // Fråga 43
        System.out.println("\nFråga 43: Vad är en typisk egenskap hos personer med en Röd personlighet?");
        System.out.println("a) Att vara ödmjuk och lyssnande.");
        System.out.println("b) Att förlora humöret ofta.");
        System.out.println("c) Att gå rakt på sak och vara målfokuserad.");
        String answer43 = scanner.nextLine();
        if (answer43.equals("c")) {
            score++;
        }

        // Fråga 44
        System.out.println("\nFråga 44: Vilken retorisk strategi är viktig när du kommunicerar med en Röd personlighet?");
        System.out.println("a) Använda många metaforer och bildspråk.");
        System.out.println("b) Gå rakt på sak och hålla dig till fakta.");
        System.out.println("c) Avsluta din presentation med en fråga.");
        String answer44 = scanner.nextLine();
        if (answer44.equals("b")) {
            score++;
        }

        // Fråga 45
        System.out.println("\nFråga 45: Vad innebär uttrycket 'Dominant' i samband med en Röd personlighet?");
        System.out.println("a) Att de alltid följer andras åsikter.");
        System.out.println("b) Att de är ledare och gillar att ta kontroll.");
        System.out.println("c) Att de är följsamma och undviker att ta beslut.");
        String answer45 = scanner.nextLine();
        if (answer45.equals("b")) {
            score++;
        }
// Fråga 46
        System.out.println("\nFråga 46: Vad är en viktig kommunikationsstrategi när du kommunicerar med en person med en Blå personlighet?");
        System.out.println("a) Att skynda på beslutsfattandet.");
        System.out.println("b) Att vara detaljerad och exakt.");
        System.out.println("c) Att undvika att ge för mycket information.");
        String answer46 = scanner.nextLine();
        if (answer46.equals("b")) {
            score++;
        }

        // Fråga 47
        System.out.println("\nFråga 47: Vilken egenskap är typisk för personer med en Blå personlighet?");
        System.out.println("a) Att vara uppgiftsfokuserade och analytiska.");
        System.out.println("b) Att vara entusiastiska och kreativa.");
        System.out.println("c) Att vara flexibla och öppna för nya idéer.");
        String answer47 = scanner.nextLine();
        if (answer47.equals("a")) {
            score++;
        }

        // Fråga 48
        System.out.println("\nFråga 48: Vad betyder uttrycket 'Competent' när det används i samband med en Blå personlighet?");
        System.out.println("a) Att de alltid är osäkra om sina kunskaper.");
        System.out.println("b) Att de är analytiska och systematiska i sin tillvägagångssätt.");
        System.out.println("c) Att de alltid agerar perfektionister.");
        String answer48 = scanner.nextLine();
        if (answer48.equals("b")) {
            score++;
        }

        // Fråga 49
        System.out.println("\nFråga 49: Vilken rådgivning är relevant när du kommunicerar med en person med en Blå personlighet?");
        System.out.println("a) Att skynda på beslutsfattandet.");
        System.out.println("b) Att vara otydlig med detaljer.");
        System.out.println("c) Att ge dem tid för analys och faktagranskning.");
        String answer49 = scanner.nextLine();
        if (answer49.equals("c")) {
            score++;
        }
// Fråga 50
        System.out.println("\nFråga 50: Vilken innebörd har termen 'Konsult'?");
        System.out.println("a) En intern medarbetare som är anställd av företaget.");
        System.out.println("b) En extern rådgivare eller utförare med kompetens/expertis.");
        System.out.println("c) En anställningsform som saknar risker.");
        String answer50 = scanner.nextLine();
        if (answer50.equals("b")) {
            score++;
        }

        // Fråga 51
        System.out.println("\nFråga 51: Vad är en huvudsaklig skillnad mellan interna och externa konsulter?");
        System.out.println("a) Färdigheter och expertis.");
        System.out.println("b) Synen på 'kunden' och kostnader.");
        System.out.println("c) Arbetsbelastning och ansvar.");
        String answer51 = scanner.nextLine();
        if (answer51.equals("b")) {
            score++;
        }

        // Fråga 52
        System.out.println("\nFråga 52: Vilken av följande påståenden gäller för interna konsulter?");
        System.out.println("a) De har begränsad tillgång till information.");
        System.out.println("b) De är dyrare än externa konsulter.");
        System.out.println("c) De är mindre trygga i sin anställning.");
        String answer52 = scanner.nextLine();
        if (answer52.equals("c")) {
            score++;
        }

        // Fråga 53
        System.out.println("\nFråga 53: Vad är den huvudsakliga innebörden av termen 'Konsult'?");
        System.out.println("a) En anställningsform som saknar risker.");
        System.out.println("b) En utförare eller resurs med kompetens/expertis.");
        System.out.println("c) En intern medarbetare som är anställd av företaget.");
        String answer53 = scanner.nextLine();
        if (answer53.equals("b")) {
            score++;
        }
        // Fråga 54
        System.out.println("\nFråga 54: Vad innebär termen 'konsultmässighet'?");
        System.out.println("a) Att ha en perfekt klädstil.");
        System.out.println("b) En kombination av kunskaper, förmågor, och hur de används i professionen.");
        System.out.println("c) Att vara den bästa lyssnaren.");
        String answer54 = scanner.nextLine();
        if (answer54.equals("b")) {
            score++;
        }

        // Fråga 55
        System.out.println("\nFråga 55: Vilken aspekt av 'konsultmässighet' handlar om hur du ser ut när du träffar kunder?");
        System.out.println("a) Hur kompetent du är i ditt arbete.");
        System.out.println("b) Att göra kunden till hjälte.");
        System.out.println("c) Att anpassa klädseln till företaget du besöker.");
        String answer55 = scanner.nextLine();
        if (answer55.equals("c")) {
            score++;
        }

        // Fråga 56
        System.out.println("\nFråga 56: Vilken del av 'konsultmässighet' handlar om hur väl du använder dina kunskaper och förmågor i din profession?");
        System.out.println("a) Hur du ser ut.");
        System.out.println("b) Hur kompetent du är.");
        System.out.println("c) Hur du kommunicerar med kunder.");
        String answer56 = scanner.nextLine();
        if (answer56.equals("b")) {
            score++;
        }

        // Fråga 57
        System.out.println("\nFråga 57: Hur kan du göra din kund till hjälte som en del av 'konsultmässighet'?");
        System.out.println("a) Genom att vara den bästa lyssnaren.");
        System.out.println("b) Genom att skicka e-post.");
        System.out.println("c) Genom att göra vad kunden vill, oavsett vad det är.");
        String answer57 = scanner.nextLine();
        if (answer57.equals("a")) {
            score++;
        }
// Fråga 58
        System.out.println("\nFråga 58: Vilken kompetens handlar om att ha en bred översikt och förståelse av verksamheten som konsulten arbetar inom?");
        System.out.println("a) Kommunikation.");
        System.out.println("b) Helhetssyn.");
        System.out.println("c) Expertis.");
        String answer58 = scanner.nextLine();
        if (answer58.equals("b")) {
            score++;
        }

        // Fråga 59
        System.out.println("\nFråga 59: Vilken kompetens är viktig för att kunna bygga långsiktiga relationer med kunder som konsult?");
        System.out.println("a) Kreativitet.");
        System.out.println("b) Relationsbyggare.");
        System.out.println("c) Analytisk förmåga.");
        String answer59 = scanner.nextLine();
        if (answer59.equals("b")) {
            score++;
        }

        // Fråga 60
        System.out.println("\nFråga 60: Vilken kompetens handlar om att vara självgående och kunna arbeta självständigt?");
        System.out.println("a) Ledarskap.");
        System.out.println("b) Självgående.");
        System.out.println("c) Omvärldskunskap.");
        String answer60 = scanner.nextLine();
        if (answer60.equals("b")) {
            score++;
        }

        // Fråga 61
        System.out.println("\nFråga 61: Vilken kompetens är viktig för att förstå och kunna utnyttja teknik och teknologi i konsultarbetet?");
        System.out.println("a) Våga.");
        System.out.println("b) Teknik/teknologi.");
        System.out.println("c) Attityd.");
        String answer61 = scanner.nextLine();
        if (answer61.equals("b")) {
            score++;
        }
        // Fråga 62
        System.out.println("\nFråga 62: Vilken utmaning kan vara förknippad med anställningsformen som konsult?");
        System.out.println("a) Sekretess.");
        System.out.println("b) Osäkerhet.");
        System.out.println("c) Tydlighet i uppdraget.");
        String answer62 = scanner.nextLine();
        if (answer62.equals("b")) {
            score++;
        }

        // Fråga 63
        System.out.println("\nFråga 63: Vilken fördel kan vara förknippad med att vara konsult när det gäller nätverk?");
        System.out.println("a) Omväxling.");
        System.out.println("b) Självständighet.");
        System.out.println("c) Breddar nätverket.");
        String answer63 = scanner.nextLine();
        if (answer63.equals("c")) {
            score++;
        }

        // Fråga 64
        System.out.println("\nFråga 64: Vilken möjlighet kan vara förknippad med att vara konsult när det gäller lärande?");
        System.out.println("a) Ständig utveckling genom uppdragen.");
        System.out.println("b) Omväxling.");
        System.out.println("c) Lojalitet tillhörighet.");
        String answer64 = scanner.nextLine();
        if (answer64.equals("a")) {
            score++;
        }
        // Fråga 65
        System.out.println("\nFråga 65: Vilken personlighetsegenskap är typisk för en utvecklare i ett team?");
        System.out.println("a) Saklig.");
        System.out.println("b) Kreativ.");
        System.out.println("c) Konflikträdd.");
        String answer65 = scanner.nextLine();
        if (answer65.equals("b")) {
            score++;
        }

        // Fråga 66
        System.out.println("\nFråga 66: Vad är en vanlig egenskap hos en analytiker i ett team?");
        System.out.println("a) Sällskaplig.");
        System.out.println("b) Saklig.");
        System.out.println("c) Konflikträdd.");
        String answer66 = scanner.nextLine();
        if (answer66.equals("b")) {
            score++;
        }

        // Fråga 67
        System.out.println("\nFråga 67: Vilken roll inom ett team eftersträvar harmoni och är bra på att lyssna?");
        System.out.println("a) Utvecklaren.");
        System.out.println("b) Analytikern.");
        System.out.println("c) Lagspelaren.");
        String answer67 = scanner.nextLine();
        if (answer67.equals("c")) {
            score++;
        }
        // Fråga 68
        System.out.println("\nFråga 68: Vilken personlighetsegenskap är typisk för en utformare i ett team?");
        System.out.println("a) Utåtriktad.");
        System.out.println("b) Saklig.");
        System.out.println("c) Stresstålig.");
        String answer68 = scanner.nextLine();
        if (answer68.equals("a")) {
            score++;
        }

        // Fråga 69
        System.out.println("\nFråga 69: Vad är en vanlig egenskap hos en ordförande i ett team?");
        System.out.println("a) Utåtriktad.");
        System.out.println("b) Säker.");
        System.out.println("c) Dynamisk.");
        String answer69 = scanner.nextLine();
        if (answer69.equals("b")) {
            score++;
        }

        // Fråga 70
        System.out.println("\nFråga 70: Vilken roll inom ett team är bra på att utveckla nya möjligheter och kontakter?");
        System.out.println("a) Analytiker.");
        System.out.println("b) Utformare.");
        System.out.println("c) Nätverkare.");
        String answer70 = scanner.nextLine();
        if (answer70.equals("c")) {
            score++;
        }
        // Fråga 71
        System.out.println("\nFråga 71: Vilken personlighetsegenskap är typisk för en genomförare i ett team?");
        System.out.println("a) Praktisk.");
        System.out.println("b) Utåtriktad.");
        System.out.println("c) Analytisk.");
        String answer71 = scanner.nextLine();
        if (answer71.equals("a")) {
            score++;
        }

        // Fråga 72
        System.out.println("\nFråga 72: Vad kännetecknar en avslutare i ett team?");
        System.out.println("a) Lågt sinne för detaljer och genomförandekapacitet.");
        System.out.println("b) Brist på självkontroll och disciplin.");
        System.out.println("c) Stor uppmärksamhet på detaljer och förmåga att avsluta uppgifter.");
        String answer72 = scanner.nextLine();
        if (answer72.equals("c")) {
            score++;
        }

        // Fråga 73
        System.out.println("\nFråga 73: Vad är en typisk egenskap hos en lagspelare i ett team?");
        System.out.println("a) Sällskaplig och diplomatisk.");
        System.out.println("b) Provokativ och dynamisk.");
        System.out.println("c) Engagerad och utåtriktad.");
        String answer73 = scanner.nextLine();
        if (answer73.equals("a")) {
            score++;
        }
        // Fråga 74
        System.out.println("\nFråga 74: Vad är en typisk egenskap hos en specialist i ett team?");
        System.out.println("a) Inriktad på helheten och deltar aktivt i olika områden.");
        System.out.println("b) Engagerad i ett smalt område och försvarar det hårt.");
        System.out.println("c) Flexibel och mångsidig, tar på sig olika roller i teamet.");
        String answer74 = scanner.nextLine();
        if (answer74.equals("b")) {
            score++;
        }
        // Fråga 75
        System.out.println("\nFråga 75: Vilken av följande påståenden beskriver en naturlig spänning mellan Belbins teamroller?");
        System.out.println("a) Ordförande och Utvecklare har naturlig spänning eftersom de är bäst vänner.");
        System.out.println("b) Lagspelaren och Utföraren har naturlig spänning eftersom de vill samma sak.");
        System.out.println("c) Nätverkaren och Avslutaren har naturlig spänning eftersom de ser detaljer och det finstilta.");
        String answer75 = scanner.nextLine();
        if (answer75.equals("c")) {
            score++;
        }

        // Skriv ut resultatet
        System.out.println("\nDin poäng: " + score + "/75");
    }
}
