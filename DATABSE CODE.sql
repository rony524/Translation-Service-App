CREATE TABLE clients (
	client_id SERIAL PRIMARY KEY,
	name VARCHAR(100) NOT NULL,
	email VARCHAR(150) UNIQUE NOT NULL,
	phone VARCHAR(50),
	create_at TIMESTAP DEFUALT NOW()
);

CREATE TABLE staff (
	staff_id SERIAL PRIMARY KEY,
	client_id INT NOT NULL REFERENCES clients(client_id) ON DELETE CASCADE,
	name VARCHAR(100) NOT NULL,
	username VARCHAR(100) NOT NULL,
	password_hash VARCHAR(100) UNIQUE NOT NULL,
	role VARCHAR(100) NOT NULL CHECK(role in ('translator', 'Admin', 'User'))
	
);

CREATE TABLE requests (
	request_id SERIAL PRIMARY KEY,
	client_id INT NOT NULL REFERENCES clients(client_id) ON DELETE CASCADE,
	staff_id INT REFERENCES staff(staff_id),
	source_language VARCHAR(50) NOT NULL,
	target_language VARCHAR(50) NOT NULL,
	word_count INT,
	price NUMERIC(10,2),
	status VARCHAR(20) DEFAULT 'pending' CHECK (status IN ('pending', 'in_progress', 'completed', 'cancelled', 'invoiced') ),
	created_at TIMESTAMP DEFAULT NOW();
);


CREATE TABLE documents (
	documents_id SERIAL PRIMARY KEY,
	client_id INT NOT NULL REFERENCES clients(client_id) ON DELETE CASCADE ;
	request_id INT NOT NULL REFERENCES requests(request_id) ON DELETE CASCADE;
	document_type VARCHAR(100) NOT NULL Check (document_type in ('Original', 'Translated', 'Certificate' , 'Final')),
	file_name VARCHAR(100) NOT NULL,
	file_type VARCHAR(150),
	storage_path TEXT NOT NULL,
	create_at TIMESTAMP DEFAULT NOW();


)

CREATE TABLE invoice (
	invoice_id SERIAL PRIMARY KEY,
	request_id INT NOT NULL REFERENCES requests(request_id) ON DELETE CASCADE,
)

