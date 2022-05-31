package and5.abrar.jetpackcompose

class StudentRepository {
    fun getAllData():List<Student>{
        return listOf(
            Student(
                id = 0,
                name = "abrar",
                age = "22"
            ),
            Student(
                id = 1,
                name = "abrarMA",
                age = "44"
            ),
            Student(
                id = 2,
                name = "abrarmAnwar",
                age = "222"
            ),
            Student(
                id = 3,
                name = "dimas",
                age = "9999"
            ),
            Student(
                id = 4,
                name = "abrarmAnwar",
                age = "7"
            ),
            Student(
                id = 5,
                name = "putri",
                age = "100"
            ),
            Student(
                id = 6,
                name = "ikhwan",
                age = "24"
            ),
            Student(
                id = 7,
                name = "patra",
                age = "24"
            )
        )
    }
}