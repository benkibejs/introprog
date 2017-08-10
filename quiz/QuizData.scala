package genquiz  // see types in package object in TypesAndUtils.scala

object QuizData {  // to generate tables for a concept connection quizes in latex

  def concepts(q: QuizName): Concepts =
    quizes(q).zipWithIndex.map { case ((k,v), i) => ((k.trim,i), (v.trim,i)) }

  def quizNames: Vector[QuizName] = quizes.keys.toVector

  val quizes = Map[QuizName, Vector[Concept]](

    "quiz-w01-concepts" -> Vector( //expressions
      "litteral       " -> "anger ett specifikt datavärde",
      "sträng         " -> "en sekvens av tecken",
      "sats           " -> "en kodrad som gör något; kan särskiljas med semikolon",
      "uttryck        " -> "kombinerar värden och funktioner till ett nytt värde",
      "funktion       " -> "vid anrop beräknas ett returvärde",
      "procedur       " -> "vid anrop sker (sido)effekt; returvärdet är tomt",
      "exekveringsfel " -> "sker medan programmet kör",
      "kompileringsfel" -> "sker innan exekveringen startat",
      "abstrahera     " -> "att införa nya begrepp som förenklar kodningen",
      "kompilera      " -> "att översätta kod till exekverbar form",
      "typ            " -> "beskriver vad data kan användas till",
      "for-sats       " -> "bra då antalet repetitioner är bestämt i förväg",
      "while-sats     " -> "bra då antalet repetitioner ej är bestämt i förväg",
      "tilldelning    " -> "för att ändra en variabels värde",
      "flyttal        " -> "decimaltal med begränsad noggrannhet",
      "boolesk        " -> "antingen sann eller falsk"
    ),

    "quiz-w01-types" -> Vector(
      "\\code|1    |" -> "\\code|Int    |",
      "\\code|1L   |" -> "\\code|Long   |",
      "\\code|1.0  |" -> "\\code|Double |",
      "\\code|1D   |" -> "\\code|Double |",
      "\\code|1F   |" -> "\\code|Float  |",
      "\\code|'1'  |" -> "\\code|Char   |",
      "\\code|\"1\"|" -> "\\code|String |",
      "\\code|true |" -> "\\code|Boolean|",
      "\\code|false|" -> "\\code|Boolean|",
      "\\code|()   |" -> "\\code|Unit   |"
    ),

    "quiz-w01-values" -> Vector(
      "\\code|1.0 + 18          |"    ->   "\\code|19.0: Double    | ",
      "\\code|(41 + 1).toDouble |"    ->   "\\code|42.0: Double    | ",
      "\\code|1.042e42 + 1      |"    ->   "\\code|1.042E42: Double| ",
      "\\code|12E6.toLong       |"    ->   "\\code|12000000: Long  | ",
      "\\code|32.toChar.toString|"    ->   "\\code|\" \": String   | ",
      "\\code|'A'.toInt         |"    ->   "\\code|65: Int         | ",
      "\\code|0.toInt           |"    ->   "\\code|0: Int          | ",
      "\\code|'0'.toInt         |"    ->   "\\code|48: Int         | ",
      "\\code|'9'.toInt         |"    ->   "\\code|57: Int         | ",
      "\\code|'A' + '0'         |"    ->   "\\code|113: Int        | ",
      "\\code|('A' + '0').toChar|"    ->   "\\code|'q': Char       | ",
      "\\code|\"*!%#\".charAt(0)|"    ->   "\\code|'*': Char       | "
    ),

    "quiz-w01-intdiv" -> Vector(
      "\\code| 4 / 42      |" ->   "\\code|    0: Int      | ",
      "\\code| 42.0 / 2    |" ->   "\\code| 10.5: Double   | ",
      "\\code| 42 / 4      |" ->   "\\code|   10: Int      | ",
      "\\code| 42 % 4      |" ->   "\\code|    2: Int      | ",
      "\\code| 4 % 42      |" ->   "\\code|    4: Int      | ",
      "\\code| 40 % 4 == 0 |" ->   "\\code|true : Boolean  | ",
      "\\code| 42 % 4 == 0 |" ->   "\\code|false: Boolean  | "
    ),

    "quiz-w02-concepts" -> Vector(  //programs
      "kompilerad     " -> "maskinkod sparad och kan köras igen utan kompilering",
      "skript         " -> "maskinkod sparas ej utan skapas vid varje körning",
      "objekt         " -> "samlar variabler och funktioner",
      "main           " -> "där exekveringen av kompilerad app startar",
      "programargument" -> "överförs via parametern args i main",
      "datastruktur   " -> "många olika element i en helhet; elementvis åtkomst",
      "samling        " -> "datastruktur med element av samma typ",
      "sekvenssamling " -> "datastruktur med element i en viss ordning",
      "Array          " -> "en förändringsbar, indexerbar sekvenssamling",
      "Vector         " -> "en oföränderlig, indexerbar sekvenssamling",
      "Range          " -> "en samling som representerar ett intervall av heltal",
      "yield          " -> "används i for-uttryck för att skapa ny samling",
      "map            " -> "applicerar en funktion på varje element i en samling",
      "algoritm       " -> "stegvis beskrivning av en lösning på ett problem",
      "implementation " -> "en specifik realisering av en algoritm",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w02-hello-scala-java" -> Vector(  //programs
//       "\\code|object|       " -> "\\jcode|public class|      ",
       "\\code|def main|     " -> "\\jcode|public static main|",
       "\\code|Array[String]|" -> "\\jcode|String[]|          ",
       "\\code|: Unit|       " -> "\\jcode|void|              ",
       "\\code|=|            " -> "\\jcode|) {|               ",
       "\\code|println|      " -> "\\jcode|System.out.println|",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w02-array-vector-mutability" -> Vector(  //programs
      "Vector" -> "oföränderlig",
      "Array " -> "förändringsbar",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w02-array-vector-append" -> Vector(  //programs
      "Vector" -> "varianter med fler/andra element skapas snabbt ur befintlig",
      "Array " -> "långsam vid ändring av storlek (kopiering av rubbet krävs)",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w02-array-vector-equality" -> Vector(  //programs
      "Vector" -> "\\code|xs == ys| är \\code|true| om alla element lika",
      "Array " -> "olikt andra Scala-samlingar kollar \\code|==| ej innehållslikhet",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),


    "quiz-w02-collection-methods" -> Vector(  //programs
      "\\code|val xs = Vector(2) |" -> "ny referens till sekvens av längd 1",
      "\\code|Array.fill(9)(0)   |" -> "ny förändringsbar sekvens med nollor",
      "\\code|Vector.fill(9)(' ')|" -> "ny oföränderlig sekvens med blanktecken",
      "\\code|xs(0)              |" -> "förkortad skrivning av \\code|apply(0)|",
      "\\code|xs.apply(0)        |" -> "indexering, ger första elementet",
      "\\code|xs :+ 0            |" -> "ny samling med en nolla tillagd på slutet",
      "\\code|0 +: xs            |" -> "ny samling med en nolla tillagd i början",
      "\\code|xs.mkString        |" -> "ny sträng med alla element intill varandra",
      "\\code|xs.mkString(\",\") |" -> "ny sträng med komma mellan elementen",
      "\\code|xs.map(_.toString) |" -> "ny samling, elementen omgjorda till strängar",
      "\\code|xs map (_.toInt)   |" -> "ny samling, elementen omgjorda till heltal",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w02-for-yield-map" -> Vector(  //programs
      "\\code|for (x <- xs) yield x * 2|" -> "\\code|Vector(1, 2, 4)|",
      "\\code|for (i <- xs.indices) yield i|" -> "\\code|Vector(0, 1, 2)|",
      "\\code|xs.map(x => x + 1)    |" -> "\\code|Vector(2, 3, 4)|",
      "\\code|for (i <- 0 to 1) yield xs(i)|" -> "\\code|Vector(1, 2)|",
      "\\code|(1 to 3).map(i => i)|" -> "\\code|Vector(1, 2, 3)|",
      "\\code|(1 until 3).map(i => xs(i))|" -> "\\code|Vector(2, 3)|",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w03-concepts" -> Vector(  //functions
      "funktionshuvud    " -> "har parameterlista och eventuellt en returtyp",
      "funktionskropp    " -> "koden som exekveras vid funktionsanrop",
      "parameterlista    " -> "beskriver namn och typ på parametrar",
//      "parameter         " -> "namn i funktionshuvud; binds till argument",
//      "argument          " -> "uttryck som är invärde vid funktionsanrop",
      "block             " -> "kan ha lokala namn; sista raden ger värdet",
      "namngivna argument" -> "gör att argument kan ges i valfri ordning",
      "defaultargument   " -> "gör att argument kan utelämnas",
      "värdeanrop        " -> "argumentet evalueras innan anrop",
      "namnanrop         " -> "fördröjd evaluering av argument",
      "tupel             " -> "lista med bestämt antal (heterogena) värden",
      "tupelreturtyp     " -> "gör att en funktion kan flera resultatvärden",
      "äkta funktion     " -> "ger alltid samma resultat om samma argument",
      "predikat          " -> "en funktion som ger ett booleskt värde",
      "slumptalsfrö      " -> "ger återupprepningsbar sekvens av pseudoslumptal",
      "anonym funktion   " -> "funktion utan namn; kallas även lambda",
      "rekursiv funktion " -> "en funktion som anropar sig själv",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w03-code-fragments" -> Vector(  //programs
      "\\code|options.indices|" -> "heltalssekvens med alla index i en sekvens",
      "\\code|\"1X2\".toLowercase|" -> "gör om en sträng till små bokstäver",
      "\\code|Random.nextInt(n)|" -> "slumptal i intervallet \\code|0 until n|",
      "\\code|try { } catch { }|" -> "fångar undantag för att förhindra krasch",
      "\\code|\"\"\" ... \"\"\"|" -> "sträng som kan sträcka sig över flera kodrader",
      "\\code|s.stripMargin|" -> "tar bort marginal till och med vertikalstreck",
      "\\code|e.printStackTrace|" -> "skriver ut information om ett undantag",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w03-yield-map" -> Vector(  //programs
      "\\code|for (i <- 1 to 3) yield öka(i)|" -> "\\code|Vector(2, 3, 4)|",
      "\\code|Vector(2, 3, 4).map(i => öka(i))|" -> "\\code|xs|",
      "\\code|xs.map(öka)|" -> "\\code|Vector(4, 5, 6)|",
      "\\code|xs.map(öka).map(öka)|" -> "\\code|Vector(5, 6, 7)|",
      "\\code|xs.foreach(öka)|" -> "\\code|()|",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w03-function-values" -> Vector(  //programs
      "\\code| öka(-1)     |" -> "\\code| 0     |",
      "\\code| app(1, öka) |" -> "\\code| öka(1)|",
      "\\code| app(5, f2)  |" -> "\\code| 4     |",
      "\\code| f1(2)       |" -> "\\code| 3     |",
      "\\code| f2(2)       |" -> "\\code| 1     |",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w03-lambda" -> Vector(  //programs
      "\\code|(0 to 2).map(i => i + 1)           |" -> "\\code|(2 to 4).map(i => i - 1)|",
      "\\code|(1 to 3).map(_ + 1)                |" -> "\\code|Vector(2, 3, 4)         |",
      "\\code|(2 to 4).map(math.pow(2, _))       |" -> "\\code|Vector(4.0, 8.0, 16.0)  |",
      "\\code|(3 to 5).map(math.pow(_, 2))       |" -> "\\code|Vector(9.0, 16.0, 25.0) |",
      "\\code|(4 to 6).map(_.toDouble).map(_ / 2)|" -> "\\code|Vector(2.0, 2.5, 3.0)   |",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w04-concepts" -> Vector(  //objects
      "modul             " -> "kodenhet med abstraktioner som kan återanvändas",
      "singelobjekt      " -> "modul som kan ha tillstånd; finns i en enda upplaga",
      "paket             " -> "modul som skapar namnrymd; maskinkod får egen katalog",
      "import            " -> "gör namn tillgängligt utan att hela sökvägen behövs",
      "lat initialisering" -> "allokering sker först när namnet refereras",
      "medlem            " -> "tillhör ett objekt; nås med punktnotation om synlig",
      "attribut          " -> "variabel som utgör (del av) ett objekts tillstånd",
      "metod             " -> "funktion som är medlem av ett objekt",
      "privat            " -> "modifierar synligheten av en objektmedlem",
      "överlagring       " -> "metoder med samma namn men olika parametertyper",
      "namnskuggning     " -> "lokalt namn döljer samma namn i omgivande block",
      "namnrymd          " -> "omgivning där är alla namn är unika",
      "uniform access    " -> "ändring mellan def och val påverkar ej användning",
      "punktnotation     " -> "används för att komma åt icke-privata delar",
      "typalias          " -> "alternativt namn på typ som ofta ökar läsbarheten",
      "         " -> "",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w05-concepts" -> Vector(  //classes
      "klass           " -> "en mall för att skapa flera instanser av samma typ",
      "instans         " -> "upplaga av ett objekt med eget tillståndsminne",
      "konstruktor     " -> "skapar instans, allokerar plats för tillståndsminne",
      "klassparameter  " -> "binds till argument som ges vid konstruktion",
      "referenslikhet  " -> "instanser anses olika även om tillstånden är lika",
      "innehållslikhet " -> "instanser anses lika om de har samma tillstånd",
      "case-klass      " -> "slipper skriva new; automatisk innehållslikhet",
      "getter          " -> "indirekt åtkomst av attributvärde",
      "setter          " -> "indirekt tilldelning av attributvärde",
      "kompanjonsobjekt" -> "ser privata medlemmar i klass med samma namn",
      "fabriksmetod    " -> "hjälpfunktion för indirekt konstruktonsanrop",
      "\\code|null|    " -> "ett värde som ej refererar till någon instans",
      "\\code|new|     " -> "nyckelord vid direkt instansiering av klass"
    ).filter(_._1.trim.nonEmpty),

    "quiz-w05-class-instance" -> Vector(  //programs
      "\\code|Singelpunkt.x               |" -> "\\code|1|",
      "\\code|Punkt.x                     |" -> "\\code|error: not found: value|",
      "\\code|val p  = new Singelpunkt    |" -> "\\verb|error: not found: type|",
      "\\code|val p1 = new Punkt          |" -> "\\verb|p1: Punkt = Punkt@27a1a53c|",
      "\\code|val p2 = new Punkt          |" -> "\\verb|p2: Punkt = Punkt@51ab04bd|",
      "\\code|{ p1.x = 1; p2.x }          |" -> "\\code|3|",
      "\\code|(new Punkt).y               |" -> "\\code|2|",
      "\\code|{ val p: Punkt = null; p.x }|" -> "\\code|java.lang.NullPointerException|",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w05-class-param" -> Vector(  //programs
      "\\code|val p1 = Point(1, 2)        |" -> "\\code|error: not found: value|",
      "\\code|val p2 = new Point          |" -> "\\code|error: not enough arguments|",
      "\\code|val p1 = new Point(1, 2)    |" -> "\\verb|p1: Point = Point@30ef773e|",
      "\\code|val p2 = new Point(3, 4)    |" -> "\\verb|p2: Point = Point@218cf600|",
      "\\code|p2.x - p1.x                 |" -> "\\code|2|",
      "\\code|(new Point(0, 1)).y         |" -> "\\code|1|",
      "\\code|new Point(0, 1, 2)          |" -> "\\code|error: too many arguments|",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w05-class-arg" -> Vector(  //programs
      "\\code|val p1 = new Point3D        |" -> "\\verb|p1: Point3D = Point3D@2eb37eee|",
      "\\code|val p2 = new Point3D(y = 1) |" -> "\\verb|p2: Point3D = Point3D@65a9e8d7|",
      "\\code|(new Point3D(z = 2)).z      |" -> "\\code|error: not found: value|",
      "\\code|p2.y = 0                    |" -> "\\code|error: reassignment to val|",
      "\\code|p2.y == 0                   |" -> "\\code|false|",
      "\\code|p1.x == (new Point3D).x     |" -> "\\code|true|",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w05-case-class" -> Vector(  //programs
      "\\code|val p1 = new Pt(1,2)        |" -> "\\code|Pt(1,2)|",
      "\\code|val p2 = Pt(y=3)            |" -> "\\code|Pt(0,3)|",
      "\\code|val p3 = new MutablePt(5, 6)|" -> "\\code|MPt(5,6)|",
      "\\code|val p4 = Mutable()          |" -> "\\code|error: not found: value|",
      "\\code|p2.moved(dx=1) == Pt(1, 3)  |" -> "\\code|true|",
      "\\code|p3.move(dy=1) == new MutablePt(5,7)|" -> "\\code|false|",
      "\\code|p2 == p3                      |" -> "\\verb|warning: always false|",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w06-concepts" -> Vector(  //sequences
//      "datastruktur     " -> "många olika element i en helhet; elementvis åtkomst",
      "element          " -> "objekt i en datastruktur",
      "samling          " -> "datastruktur med element av samma typ",
      "samlingsbibliotek" -> "många färdiga samlingar med olika egenskaper",
      "sekvenssamling   " -> "noll el. flera element av samma typ i viss ordning",
      "sekvensalgoritm  " -> "lösning på problem som drar nytta av sekvenssamling",
      "ordning          " -> "definierar hur element av en viss typ ska ordnas",
      "sortering        " -> "algoritm som ordnar element i en viss ordning",
      "söking           " -> "algoritm som letar upp element enligt sökkriterium",
      "linjärsöking     " -> "sökalgoritm som letar i sekvens tills element hittas",
      "registrering     " -> "algoritm som räknar element med vissa egenskaper",
      "varargs          " -> "variabelt antal argument, asterisk efter parametertyp ",
      "tidskomplexitet  " -> "hur exekveringstiden växer med problemstorleken",
      "minneskomplexitet" -> "hur minnesåtgången växer med problemstorleken",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w06-seq-collections" -> Vector(  //sequences
      "\\code|Vector     |" -> "oföränderlig, ger snabbt godtyckligt ändrad samling",
      "\\code|List       |" -> "oföränderlig, ger snabbt ny samling ändrad i början",
      "\\code|Array      |" -> "primitiv, förändringsbar, snabb indexering, fix storlek",
      "\\code|ArrayBuffer|" -> "förändringsbar, snabb indexering, kan ändra storlek",
      "\\code|ListBuffer |" -> "förändringsbar, snabb att ändra i början",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w06-abstract-collections" -> Vector(  //sequences
      "Traversable " -> "bastyp för alla samlingar, har metoden \\code|foreach|",
      "Iterable    " -> "är traverserbar med hjälp av metoden \\code|iterator|",
      "Seq         " ->  "bastyp för alla sekvenssamlingar, indexposition från 0",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),

    "quiz-w06-seq-methods" -> Vector(  //sequences
      "\\code|x +: xs         |" -> "\\code|Vector(0, 1, 2, 3)                      |",
      "\\code|xs +: x         |" -> "\\code|error: value +: is not a member of Int  |",
      "\\code|xs :+ x         |" -> "\\code|Vector(1, 2, 3, 0)                      |",
      "\\code|xs ++ xs        |" -> "\\code|Vector(1, 2, 3, 1, 2, 3)                |",
      "\\code|xs.indices      |" -> "\\code|(0 until 3)                             |",
      "\\code|xs apply 0      |" -> "\\code|1                                       |",
      "\\code|xs(3)           |" -> "\\code|java.lang.IndexOutOfBoundsException     |",
      "\\code|xs.length       |" -> "\\code|3                                       |",
      "\\code|xs.take(4)      |" -> "\\code|Vector(1, 2, 3)                         |",
      "\\code|xs.drop(2)      |" -> "\\code|Vector(3)                               |",
      "\\code|xs.updated(0, 2)|" -> "\\code|Vector(2, 2, 3)                         |",
      "\\code|xs.tail.head    |" -> "\\code|2                                       |",
      "\\code|xs.head.tail    |" -> "\\code|error: value tail is not a member of Int|",
      "\\code|xs.isEmpty      |" -> "\\code|false                                   |",
      "\\code|xs.nonEmpty     |" -> "\\code|true                                    |",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),


    "quiz-w06-seq-update" -> Vector(  //sequences
      "\\code|{ buf(0) = -1; buf(0) }   |" -> "\\code|-1|",
      "\\code|{ xs(0) = -1; xs(0) }|" ->"{\\small\\code|error: value update is not a member|}",
      "\\code|buf.update(1, 5)          |"   -> "\\code|(): Unit|",
      "\\code|xs.updated(0, 5)          |" -> "\\code|Vector(5, 2, 3, 4)|",
      "\\code|{ buf += 5; buf }         |"   -> "\\code|ArrayBuffer(1, 5, 3, 4, 5)|",
      "\\code|{ xs += 5; xs }         |"   -> "{\\small\\code|error: value += is not a member|}",
      "\\code|xs.patch(1,Vector(-1,5),3)|"   -> "\\code|Vector(1, -1, 5)|",
      "\\code|xs                        |"   -> "\\code|Vector(1, 2, 3, 4)|",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),


    "quiz-w06-seq-find" -> Vector(  //sequences
      "\\code|xs.indexOf(0)        |" -> "\\code|5|",
      "\\code|xs.indexOf(6)        |" -> "\\code|-1|",
      "\\code|xs.indexWhere(_ < 2) |" -> "\\code|4|",
      "\\code|xs.indexWhere(_ != 5)|" -> "\\code|1|",
      "\\code|xs.find(_ == 1)      |" -> "\\code|Some(1)|",
      "\\code|xs.find(_ == 6)      |" -> "\\code|None|",
      "\\code|xs.filter(_ == 1)    |" -> "\\code|Vector(1, 1)|",
      "\\code|xs.filterNot(_ > 1)  |" -> "\\code|Vector(1, 0, 1)|",
      "\\code|xs.zipWithIndex.filter(_._1 == 1).map(_._2)|" -> "\\code|Vector(4, 6)|",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),


    "quiz-w07-concepts" -> Vector(  //search, sets, maps
//      "linjärsökning      " -> "leta i sekvens tills sökkriteriet är uppfyllt",
      "mängd              " -> "unika element, kan snabbt se om element finns",
      "nyckel-värde-tabell" -> "för att snabbt hitta tillhörande värde",
      "nyckelmängd        " -> "unika identifierare, associerade med ett enda värde",
      "persistens         " -> "egenskapen att finnas kvar efter programmets avslut",
      "serialisera        " -> "koda objekt till avkodningsbar sekvens av symboler",
      "de-serialisera     " -> "avkoda symbolsekvens och återskapa objekt i minnet",
      "" -> ""
    ).filter(_._1.trim.nonEmpty),


    "" -> Vector()
  ).filter(_._1.trim.nonEmpty)
}