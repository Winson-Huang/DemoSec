DROP TABLE IF EXISTS DemosecUser;
CREATE TABLE DemosecUser (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(64) NOT NULL,
    password VARCHAR(64) NOT NULL,
    emailaddress VARCHAR(64) NOT NULL
);

INSERT INTO DemosecUser(username, password, emailaddress) VALUES
('Alice', 'secret', 'alice@alice.org'),
('Bob', 'secret', 'bob@alice.org');