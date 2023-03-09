SET FOREIGN_KEY_CHECKS = 0;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE IF NOT EXISTS developers (
    developer_id bigint AUTO_INCREMENT PRIMARY KEY,
    first_name varchar(255) NOT NULL,
    last_name varchar(255) NOT NULL,
    specialty varchar(255) NOT NULL,
    staus boolean
);

CREATE TABLE IF NOT EXISTS skills (
	skill_id bigint AUTO_INCREMENT PRIMARY KEY,
	title varchar(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS developers_skills (
	developer_id bigint,
	skill_id bigint,
	FOREIGN KEY(developer_id) REFERENCES developers(developer_id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY(skill_id) REFERENCES skills(skill_id) ON DELETE CASCADE ON UPDATE CASCADE
);

DROP TABLE IF EXISTS developers;
DROP TABLE IF EXISTS skills;
DROP TABLE IF EXISTS developers_skills;

INSERT INTO developers
(first_name, last_name, specialty, staus)
VALUES
('Ivan', 'Ivanov', 'Java developer', true),
('Petr', 'Pertov', 'C++ developer', true),
('Sidor', 'Sidorov', 'C# developer', true);

INSERT INTO skills
(title)
VALUES
('Coding'),
('Reviewing'),
('Managing project'),
('Create architecture'),
('Debaging'),
('Testing'),
('Write report');

INSERT INTO developers_skills
(developer_id, skill_id)
VALUES
(1,1),(1,2),(1,5),
(2,1),(2,3),(2,7),
(3,1),(3,4),(3,6);

SELECT *
FROM developers de;

SELECT *
FROM skills sk;

SELECT *
FROM developers de 	LEFT JOIN developers_skills ds ON de.developer_id = ds.developer_id
					LEFT JOIN skills sk ON ds.skill_id = sk.skill_id;