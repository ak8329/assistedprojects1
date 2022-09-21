var emp = /** @class */ (function () {
    function emp() {
        this.id = 100;
        this.name = "krish";
    }
    emp.prototype.con = function () {
        console.log("id id" + this.id);
        console.log("name id" + this.name);
    };
    return emp;
}());
var ep = new emp();
ep.con();
