# ProyectoRelacionesDDBB
Relación Uno a Uno (One-to-One): Student y Profile

Cada estudiante (Student) tiene un perfil (Profile) único.
Y cada perfil (Profile) pertenece a un único estudiante (Student).


Un profesor (Teacher) puede enseñar varias materias (Subject).
Pero cada materia (Subject) tiene solo un profesor (Teacher).


En Teacher, tenemos una lista de subjects que el profesor enseña.
En Subject, tenemos un campo teacher que indica quién enseña esa materia.
Relación Muchos a Muchos (Many-to-Many): Student y Subject

Relaciones
Estudiante y Perfil (One-to-One): Un estudiante ↔ Un perfil
Profesor y Materia (One-to-Many): Un profesor → Varias materias
Estudiante y Materia (Many-to-Many): Un estudiante ↔ Varias materias, y una materia ↔ Varios estudiantes
