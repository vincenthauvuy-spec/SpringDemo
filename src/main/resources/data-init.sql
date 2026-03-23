INSERT INTO role ( name ) VALUES
    ('ADMIN'),
    ('USER'),
    ('SUPPLIER');

INSERT INTO app_user (email, password, pseudo, role_id) VALUES
   ('a@a.com', 'root', 'Utilisateur A', 1),
   ('b@b.com', 'root', 'Utilisateur B',3),
   ('c@c.com', 'root', 'Utilisateur C',2);

INSERT INTO component(serial_number, name, description, loaner_id) VALUES
    ('ECR4567890','Ecran de salle','Rayure sur coté',null),
    ('ECR4567891','Ecran de salle','RAS',2)