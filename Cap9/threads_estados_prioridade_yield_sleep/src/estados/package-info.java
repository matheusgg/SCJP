/**
 * Estados de uma Thread: Nova, Executável(ou ativa), Em execução,
 * Espera/Bloqueada/Suspensa, Desativada. Uma thread é considerada nova quando
 * uma instância de Thread é criada, porém o método start() não foi chamado. Uma
 * thread é considerada ativa logo após o método start() for chamado, desta
 * forma ela é elegível para ser executada pelo agendador de threads. Uma thread
 * é considerada em execução quando o agendador de threads a seleciona no pool
 * de threads. Uma thread está em espera, suspensa ou bloqueada quando há a
 * chamada de algum método de influencie o agendador de threads, porém esta
 * thread ainda está ativa. Uma thread é considerada morta, ou desativada,
 * quando o seu método run() foi finalizado.
 * 
 */
package estados;