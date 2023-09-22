CREATE DATABASE IF NOT EXISTS sistemahotel;
USE sistemahotel;

CREATE TABLE IF NOT EXISTS Funcionarios (
    id_funcionarios INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(77) NOT NULL,
    rg VARCHAR(20),
    cpf_funcionario VARCHAR(14) UNIQUE,
    cargo VARCHAR(77),
    sexo CHAR(1),
    email VARCHAR(77),
    telefone VARCHAR(20),
    cep VARCHAR(10),
    rua VARCHAR(77),
    bairro VARCHAR(77),
    numero INT,
    cidade VARCHAR(77),
    uf CHAR(2)
);

CREATE TABLE IF NOT EXISTS Fornecedores (
    id_fornecedores INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(77) NOT NULL,
    descricao TEXT,
    cpf_fornecedor VARCHAR(14) UNIQUE,
    rua VARCHAR(77),
    bairro VARCHAR(77),
    numero INT,
    cidade VARCHAR(77),
    uf CHAR(2),
    email VARCHAR(77),
    telefone VARCHAR(20),
    cep VARCHAR(10)
);

CREATE TABLE IF NOT EXISTS Clientes (
    id_clientes INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(77) NOT NULL,
    cpf VARCHAR(14) UNIQUE,
    sexo CHAR(1),
    email VARCHAR(77),
    telefone VARCHAR(20),
    cep VARCHAR(10),
    rua VARCHAR(77),
    bairro VARCHAR(77),
    numero INT,
    cidade VARCHAR(77),
    uf CHAR(2)
);

CREATE TABLE IF NOT EXISTS Produtos (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    tipo_produto VARCHAR(77) NOT NULL,
    nome VARCHAR(77) NOT NULL,
    dia_da_compra INT,
    mes_de_referencia INT,
    valor DOUBLE,
    id_fornecedores INT,
    FOREIGN KEY (id_fornecedores) REFERENCES Fornecedores(id_fornecedores)
);

CREATE TABLE IF NOT EXISTS Quartos (
    numero INT AUTO_INCREMENT PRIMARY KEY,
    setor VARCHAR(77),
    andar INT,
    ar BOOLEAN,
    id_clientes INT,
    FOREIGN KEY (id_clientes) REFERENCES Clientes(id_clientes)
);

CREATE TABLE IF NOT EXISTS Servicos (
    tipo VARCHAR(77),
    local VARCHAR(77)
);

CREATE TABLE IF NOT EXISTS Vendas (
    id_vendas INT AUTO_INCREMENT PRIMARY KEY,
    codigo INT,
    id_funcionarios INT,
    preco DOUBLE,
    data_venda DATE,
    id_clientes INT,
    FOREIGN KEY (codigo) REFERENCES Produtos(codigo),
    FOREIGN KEY (id_funcionarios) REFERENCES Funcionarios(id_funcionarios),
    FOREIGN KEY (id_clientes) REFERENCES Clientes(id_clientes)
);

CREATE TABLE IF NOT EXISTS Itens_de_Venda (
    id_itens_de_venda INT AUTO_INCREMENT PRIMARY KEY,
    codigo INT,
    preco_unitario DOUBLE,
    quantidade INT,
    subtotal DOUBLE,
    FOREIGN KEY (codigo) REFERENCES Produtos(codigo)
);

CREATE TABLE IF NOT EXISTS Compra (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_fornecedor INT,
    codigo INT,
    quantidade INT,
    preco_unitario DOUBLE,
    data_compra DATE,
    FOREIGN KEY (id_fornecedor) REFERENCES Fornecedores(id_fornecedores),
    FOREIGN KEY (codigo) REFERENCES Produtos(codigo)
);

CREATE TABLE IF NOT EXISTS Reservas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_clientes INT,
    data_checkin DATE,
    data_checkout DATE,
    nome_hospede VARCHAR(77),
    numero_quarto INT,
    status_reserva VARCHAR(77),
    valor_total DOUBLE,
    contas TEXT,
    FOREIGN KEY (id_clientes) REFERENCES Clientes(id_clientes)
);

CREATE TABLE IF NOT EXISTS Itens_da_Compra (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_produto INT,
    quantidade INT,
    preco_unitario DOUBLE,
    subtotal DOUBLE,
    FOREIGN KEY (id_produto) REFERENCES Produtos(codigo)
);