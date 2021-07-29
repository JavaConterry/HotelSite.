$.ajax({
  contentType: "application/json",
  dataType: "json",
  url: "/reserve",
  success: function (data, status) {
    console.log("ЧТО-ТО СЛУЧИЛОСЬ!");
  },
});
