// Biến lưu trữ danh sách sinh viên
var students = [];

// Hàm thêm sinh viên
function addStudent() {
  var nameInput = document.getElementById('name');
  var ageInput = document.getElementById('age');
  
  var name = nameInput.value;
  var age = ageInput.value;
  
  if (name.trim() === '' || age.trim() === '') {
    alert('Vui lòng nhập tên và tuổi của sinh viên');
    return;
  }
  
  var student = { name: name, age: age };
  students.push(student);
  
  // Cập nhật danh sách sinh viên
  updateStudentList();
  
  // Xóa nội dung các trường input
  nameInput.value = '';
  ageInput.value = '';
}

// Hàm cập nhật danh sách sinh viên
function updateStudentList() {
  var studentList = document.getElementById('student-list');
  studentList.innerHTML = '';
  
  for (var i = 0; i < students.length; i++) {
    var student = students[i];
    
    var listItem = document.createElement('li');
    listItem.className = 'student';
    
    var nameElement = document.createElement('span');
    nameElement.innerHTML = student.name;
    
    var ageElement = document.createElement('span');
    ageElement.innerHTML = student.age;
    
    var deleteButton = document.createElement('button');
    deleteButton.innerHTML = 'Xóa';
    deleteButton.onclick = deleteStudent.bind(null, i);
    
    listItem.appendChild(nameElement);
    listItem.appendChild(ageElement);
    listItem.appendChild(deleteButton);
    
    studentList.appendChild(listItem);
  }
}

// Hàm xóa sinh
