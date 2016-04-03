/**
 * Estados de uma Thread: Nova, Execut�vel(ou ativa), Em execu��o,
 * Espera/Bloqueada/Suspensa, Desativada. Uma thread � considerada nova quando
 * uma inst�ncia de Thread � criada, por�m o m�todo start() n�o foi chamado. Uma
 * thread � considerada ativa logo ap�s o m�todo start() for chamado, desta
 * forma ela � eleg�vel para ser executada pelo agendador de threads. Uma thread
 * � considerada em execu��o quando o agendador de threads a seleciona no pool
 * de threads. Uma thread est� em espera, suspensa ou bloqueada quando h� a
 * chamada de algum m�todo de influencie o agendador de threads, por�m esta
 * thread ainda est� ativa. Uma thread � considerada morta, ou desativada,
 * quando o seu m�todo run() foi finalizado.
 * 
 */
package estados;