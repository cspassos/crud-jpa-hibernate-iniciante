# crud-jpa-hibernate-iniciante

 ##Iniciando Transação
	* EntityManagerFactory - fabrica de EntityManager;
	* EntityManager - serviço central para todas as ações de persistência. Para funcionar devo criar primeiro o EntityManagerFactory;
	
	* Toda vez ao inicializar um banco de dados, deve iniciar uma transação o begin faz isso e atualiza o banco de dados depois deve usar o commit para commitar a transação.
	* 