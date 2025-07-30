📌 Relacionamento entre Tabelas
Relacionamento entre tabelas é a forma como conectamos dados de uma tabela com outra no banco de dados. Ele garante integridade e organização das informações.
🔗 Tipos de Relacionamento
•	Um para Um (1:1): Um registro em uma tabela se relaciona com um único registro em outra.
•	Um para Muitos (1:N): Um registro em uma tabela pode se relacionar com vários registros em outra.
•	Muitos para Muitos (N:N): Vários registros em uma tabela podem se relacionar com vários registros em outra.
⚙️ Anotações e Configurações
•	@JoinColumn: Define a coluna que fará o vínculo entre as tabelas (chave estrangeira).
•	cascade = CascadeType.ALL: Propaga todas as operações (salvar, deletar, atualizar) para a entidade relacionada.
•	orphanRemoval = true: Remove automaticamente registros filhos que não estão mais associados ao pai.
