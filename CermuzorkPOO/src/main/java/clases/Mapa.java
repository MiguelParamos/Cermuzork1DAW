package clases;

import java.util.ArrayList;
import java.util.Random;

/**
 * Representa una matriz de lugar, que tendra 16 posiciones (4x4), y un jugador,
 * el cual se usara para jugar.
 * 
 * @author Berta
 * @author Miguel Páramos
 *
 */
public class Mapa extends ElementoConNombre {
	/** lugares representa una matriz de tipo Lugar con 16 lugares diferentes. **/
	private Lugar[][] lugares;
	/**
	 * personaje representa un jugador de tipo Jugador, el cual se usara para jugar.
	 **/
	private Jugador personaje;

	/**
	 * Constructor de Mapa que inicializa todo, y deja el Mapa listo para empezar la
	 * partida
	 * 
	 * @param nombreJugador nombre del jugador/a que jugará la partida
	 * @param generoJugador género del jugador/a. Solo puede ser 'm' o 'f'
	 */
	public Mapa(String nombreJugador, char generoJugador) {
		// Se crea el Mapa con un nombre
		super("Tierra de cermuzos");
		Random r = new Random();

		// Se crean e inicializan todos los lugares que habrá jugables en el Mapa
		this.lugares = new Lugar[4][4];

		this.lugares[0][0] = new Lugar("Acantilado al mar I",
				"Estás ante un acantilado, que da al mar. Es un sitio muy remoto. Más allá no hay nada al norte ni al oeste. Solo puedes ir al sur y al norte.");
		this.lugares[0][1] = new Lugar("Puerto abandonado",
				"Está claro que este antiguo puerto pesquero lleva mucho tiempo abandonado. No hay nada que hacer al norte, pues todas las embarcaciones están destrozadas.");
		this.lugares[0][2] = new Lugar("Ruinas sin identificar",
				"Tienes ante tí una especie de monumento megalítico en la orilla. No puedes identificar nada, ni avanzar hacia el norte, pues el mar te corta el paso");
		this.lugares[0][3] = new Lugar("El culo del mundo",
				"Hacia el norte y el este solo puedes ver la desembocadura del río, y el mar lleno de basura flotando. Es asqueroso, no vas a ir por ahí.");
		this.lugares[1][0] = new Lugar("Viejo faro",
				"Te encuentras ante un viejo faro, que señaliza la presencia de este lugar a los navegantes que vienen del este. Precisamente en la dirección en la que no puedes avanzar...");
		this.lugares[1][1] = new Lugar("Pueblo Paleta",
				"Los vecinos del lugar aconsejan no meterse en la hierba alta, o ciertos bichos te morderán los tobillos.");
		this.lugares[1][2] = new Lugar("Sendero en la pradera I",
				"No hay mucho que hacer aquí, más que seguir el sendero al este o el sur, o ir a cualquier otra dirección. Pero aquí no se te ha perdido nada aparte del aire puro del campo.");
		this.lugares[1][3] = new Lugar("Orilla del Río I",
				"El río te corta el paso hacia el este, pero puedes avanzar en cualquier otra dirección, o refrescarte en el agua.");
		this.lugares[2][0] = new Lugar("Acantilado al mar II",
				"Las vistas son muy bonitas aquí, pero las cosas que hacer son pocas. Sobre todo hacia el oeste, ya que el camino acaba en el acantilado");
		this.lugares[2][1] = new Lugar("Reunión secreta de la secta de los viejos locos",
				"Quieres pasar por esta zona rápidamente, porque solo ves a muchos viejos con los pantalones bajados, cantando algo sobre yeguas grises.");
		this.lugares[2][2] = new Lugar("Sendero en la pradera II",
				"Este sendero atraviesa la zona de norte a sur. Puedes seguirlo, o ir campo a través a cualquier otro sitio.");
		this.lugares[2][3] = new Lugar("Orilla del Río II",
				"Se corta el paso al este por un río demasiado ancho como para atravesarlo. No tienes nada más que hacer aquí, lárgate.");
		this.lugares[3][0] = new Lugar("Accidente geográfico",
				"Nunca antes habías visto una montaña demasiado escarpada como para escalarla dar al mar directamente. El mar te corta el camino al oeste, y la montaña al sur. Ve por otro lado.");
		this.lugares[3][1] = new Lugar("Cueva de las salapatiusas",
				"No, no puedo describirte qué es una salapatiusa. Porque todo el que ha visto una, ha muerto de forma horrible. no vayas hacia el sur.");
		this.lugares[3][2] = new Lugar("Un pueblo italiano al pié de las montañas",
				"El pueblo es bonito, su gente agradable, menos un tal Marco, que tiene traumas infantiles. Las montañas de cortan el camino al sur.");
		this.lugares[3][3] = new Lugar("Orilla del Río III",
				"Ves el río venir desde el sur, y subir por el este hacia el norte. Los caminos al sur y al este están cortados por el río.");

		// Se inicializan las armas que portarán los cuatro enemigos que no son el boss
		// final
		Arma armaEnemigo1 = new Arma("Chancla vieja", (byte) 10, (byte) 5);
		Arma armaEnemigo2 = new Arma("Puñalico oxidao", (byte) 15, (byte) 10);
		Arma armaEnemigo3 = new Arma("Mandoble que no es doble", (byte) 15, (byte) 10);
		Arma armaEnemigo4 = new Arma("La derritecerumen", (byte) 20, (byte) 15);

		// Se inicializan las ObjetoDefensivoes que portarán los cuatro enemigos que no
		// son
		// el boss final
		ObjetoDefensivo defensaEnemigo1 = new ObjetoDefensivo("Escudo de cartón piedra", (byte) 10, (byte) 5);
		ObjetoDefensivo defensaEnemigo2 = new ObjetoDefensivo("La vergüenza de un político", (byte) 5, (byte) 1);
		ObjetoDefensivo defensaEnemigo3 = new ObjetoDefensivo("Escudo de globitos de titanio", (byte) 15, (byte) 20);
		ObjetoDefensivo defensaEnemigo4 = new ObjetoDefensivo("Escudo hecho de facturas de la luz", (byte) 30,
				(byte) 20);

		// Se crea un array de armas de enemigos, que se usará para asignar las armas
		// aleatoriamente
		ArrayList<Arma> armasEnemigos = new ArrayList<Arma>();
		armasEnemigos.add(armaEnemigo1);
		armasEnemigos.add(armaEnemigo2);
		armasEnemigos.add(armaEnemigo3);
		armasEnemigos.add(armaEnemigo4);

		// Se crea un array de ObjetoDefensivoes de enemigos, que se usará para asignar
		// las
		// ObjetoDefensivoes aleatoriamente
		ArrayList<ObjetoDefensivo> objetoDefensivoEnemigos = new ArrayList<ObjetoDefensivo>();
		objetoDefensivoEnemigos.add(defensaEnemigo1);
		objetoDefensivoEnemigos.add(defensaEnemigo2);
		objetoDefensivoEnemigos.add(defensaEnemigo3);
		objetoDefensivoEnemigos.add(defensaEnemigo4);

		// Se crea un array de nombres de enemigos, que se usará para sortear los
		// nombres aleatoriamente
		ArrayList<String> nombresEnemigos = new ArrayList<String>();
		nombresEnemigos.add("Entidad no demasiado maligna");
		nombresEnemigos.add("Mala juntura");
		nombresEnemigos.add("Idiota del pueblo");
		nombresEnemigos.add("Traficante de Cancamusas");

		// Se crea el arrayList de enemigos, donde se meterán todos los enemigos,
		// incluído el boss final
		ArrayList<Enemigo> enemigosMundo = new ArrayList<Enemigo>();

		// Se sortea un arma, una ObjetoDefensivo y un nombre para cada uno de los
		// enemigos,
		// y se meten todos
		// en enemigosMundo. Ninguno será el boss final
		while (armasEnemigos.size() > 0) {

			byte armaAleatoria = (byte) r.nextInt(armasEnemigos.size());
			byte objetoDefensivoAleatoria = (byte) r.nextInt(objetoDefensivoEnemigos.size());
			byte nombreAleatorio = (byte) r.nextInt(nombresEnemigos.size());

			enemigosMundo.add(new Enemigo(nombresEnemigos.get(nombreAleatorio), (r.nextBoolean() ? 'm' : 'f'),
					(byte) r.nextInt(26), (byte) r.nextInt(100), armasEnemigos.get(armaAleatoria),
					objetoDefensivoEnemigos.get(objetoDefensivoAleatoria), false));
			objetoDefensivoEnemigos.remove(objetoDefensivoAleatoria);
			armasEnemigos.remove(armaAleatoria);
			nombresEnemigos.remove(nombreAleatorio);
		}

		// Se crean la arma y la Mapa que llevará el boss final, con una fuerza y
		// una defensa aleatorias entre 15 y 40
		Arma armaBoss = new Arma("La cermuzadora", (byte) 30, (byte) (15 + r.nextInt(25)));
		ObjetoDefensivo defensaBoss = new ObjetoDefensivo("Olor corporal irrespirable", (byte) 30,
				(byte) (15 + r.nextInt(25)));

		// Se añade el enemigo final al mundo
		enemigosMundo.add(new Enemigo("El primo loco de Voldemort", 'm', (byte) r.nextInt(((25 - 5) + 5)), (byte) 100,
				armaBoss, defensaBoss, true));

		// Se crean las pociones que apareceran sueltas por el mundo y se meten en un
		// array
		Pocion pocion1 = new Pocion("ibuprofeno caducado", (byte) 15, (byte) 5);
		Pocion pocion2 = new Pocion("Aspirina", (byte) 30, (byte) 10);
		Pocion pocion3 = new Pocion("Poción roja", (byte) 30, (byte) 25);
		Pocion pocion4 = new Pocion("Poción muy roja", (byte) 65, (byte) 50);
		Pocion[] pocionesMundo = { pocion1, pocion2, pocion3, pocion4 };

		// Se crean las armas que venderá la tienda
		Arma armaTienda1 = new Arma("La Soplagaitas", (byte) 15, (byte) 10);
		Arma armaTienda2 = new Arma("La segadora de almas", (byte) 40, (byte) 25);
		Arma armaTienda3 = new Arma("La trepanadora de sobacos", (byte) 25, (byte) 15);
		Arma armaTienda4 = new Arma("La deshollinadora de narices", (byte) 30, (byte) 20);

		// Se crean las ObjetoDefensivoes que venderá la tienda
		ObjetoDefensivo defensaTienda1 = new ObjetoDefensivo("Escudo Hyliano", (byte) 40, (byte) 25);
		ObjetoDefensivo defensaTienda2 = new ObjetoDefensivo("Escudo Espartano", (byte) 30, (byte) 20);
		ObjetoDefensivo defensaTienda3 = new ObjetoDefensivo("Escudo del capitán América", (byte) 25, (byte) 15);
		ObjetoDefensivo defensaTienda4 = new ObjetoDefensivo("Tapa de alcantarilla", (byte) 15, (byte) 10);

		// Se crean las pociones que venderá la tienda
		Pocion pocionTienda1 = new Pocion("Frasquito de vida", (byte) 10, (byte) 15);
		Pocion pocionTienda2 = new Pocion("Chupito de vida", (byte) 20, (byte) 30);
		Pocion pocionTienda3 = new Pocion("Bebercio de vida", (byte) 30, (byte) 60);
		Pocion pocionTienda4 = new Pocion("Botijo de vida", (byte) 50, (byte) 100);

		// Se crea un array con todos los objetos (armas,ObjetoDefensivoes y pociones)
		// que
		// venderá la tienda
		// Y se añaden todos
		ArrayList<ObjetoComprable> articulos = new ArrayList<ObjetoComprable>();
		articulos.add(armaTienda1);
		articulos.add(armaTienda2);
		articulos.add(armaTienda3);
		articulos.add(armaTienda4);
		articulos.add(defensaTienda1);
		articulos.add(defensaTienda2);
		articulos.add(defensaTienda3);
		articulos.add(defensaTienda4);
		articulos.add(pocionTienda1);
		articulos.add(pocionTienda2);
		articulos.add(pocionTienda3);
		articulos.add(pocionTienda4);

		// Se crea la tienda
		Tienda coviran = new Tienda(articulos);

		// Variables que nos servirán para colocar aleatoriamente cosas
		byte filaAleatoria;
		byte columnaAleatoria;
		byte i = 0;

		// Se colocan aleatoriamente todas las pociones del mundo, cada una en un Lugar
		// aleatorio,
		// y asegurándonos que no se machaca una con otra en el mismo Lugar del mundo
		while (i < pocionesMundo.length) {

			filaAleatoria = (byte) r.nextInt(4);
			columnaAleatoria = (byte) r.nextInt(4);

			if (this.lugares[filaAleatoria][columnaAleatoria].getPocion() == null) {
				this.lugares[filaAleatoria][columnaAleatoria].setPocion(pocionesMundo[i]);
				i++;
			}
		}
		i = 0;

		// Se colocan aleatoriamente todos los enemigos del mundo, cada uno en un Lugar
		// aleatorio,
		// y asegurándonos que no se machaca uno con otro en el mismo Lugar del mundo
		while (i < enemigosMundo.size()) {

			filaAleatoria = (byte) r.nextInt(4);
			columnaAleatoria = (byte) r.nextInt(4);

			if (this.lugares[filaAleatoria][columnaAleatoria].getEnemigo() == null) {
				this.lugares[filaAleatoria][columnaAleatoria].setEnemigo(enemigosMundo.get(i));
				i++;
			}

		}
		i = 0;

		// Se coloca aleatoriamente la tienda, en un Lugar aleatorio
		filaAleatoria = (byte) r.nextInt(4);
		columnaAleatoria = (byte) r.nextInt(4);

		this.lugares[filaAleatoria][columnaAleatoria].setTienda(coviran);

		// Se colocan aleatoriamente todas las cantidades de dinero sueltas, cada una en
		// un Lugar aleatorio,
		// y asegurándonos que no se machaca una con otra en el mismo Lugar del mundo
		while (i < 5) {

			filaAleatoria = (byte) r.nextInt(4);
			columnaAleatoria = (byte) r.nextInt(4);

			if (this.lugares[filaAleatoria][columnaAleatoria].getDinero() == 0) {
				this.lugares[filaAleatoria][columnaAleatoria].setDinero((byte) r.nextInt(51));
				i++;
			}

		}
		i = 0;

		// Se declaran el arma y la Mapa del jugador, y se crea un jugador en un
		// sitio
		// Aleatorio del mapa.
		Arma armaJugador = new Arma("Bolígrafo muy afilado", (byte) 5, (byte) 5);
		ObjetoDefensivo defensaJugador = new ObjetoDefensivo("Monitor del aula 2", (byte) 5, (byte) 5);
		this.personaje = new Jugador(nombreJugador, generoJugador, (byte) 0, (short) 100, armaJugador, defensaJugador,
				(byte) r.nextInt(4), (byte) r.nextInt(4));

	}

	/**
	 * getter de lugares
	 * 
	 * @return un lugar
	 */
	public Lugar[][] getLugares() {
		return lugares;
	}

	/**
	 * setter de lugares
	 * 
	 * @param lugares matriz de lugares
	 */
	public void setLugares(Lugar[][] lugares) {
		this.lugares = lugares;
	}

	/**
	 * getter de personaje
	 * 
	 * @return personaje jugador
	 */
	public Jugador getPersonaje() {
		return personaje;
	}

	/**
	 * setter de personaje
	 * 
	 * @param personaje de la clase jugador
	 */
	public void setPersonaje(Jugador personaje) {
		this.personaje = personaje;
	}

}
