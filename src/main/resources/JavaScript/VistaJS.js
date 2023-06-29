//CREATE AND UPDATE
$(document).on("click", ".open-modal", function () {
    const currentStudentId = Number($(this).attr('idstudent'));

    if (currentStudentId) {
        const currentStudent = students.find(x => x.id === currentStudentId);
        $("#id").val(currentStudent.id);
        $("#nombre").val(currentStudent.nombre);
        $("#identificacion").val(currentStudent.identificacion);
        $("#nivel_cursando").val(currentStudent.nivel_cursando);
        $("#edad").val(currentStudent.edad);
        $("#altura").val(currentStudent.altura);
        $("#peso").val(currentStudent.peso);
        $("#genero").val(currentStudent.genero);
    }
});

$(document).on("click", "#saveStudent", function () {
    $("#formStudent").submit();
})

//Delete
$(document).on("click", ".btnDeleteStudent", function () {
    const currentProductId = Number($(this).attr('idstudent'));
    const currentProduct = students.find(x => x.id === currentStudentId);
    $.ajax({
        url: 'student/delete',
        contentType: "application/json",
        dataType: 'json',
        type: 'POST',
        success: function (result) {
            location.reload();
        },
        //here we are serialization the object
        data: JSON.stringify(currentStudent)
    });
})