/// <reference path = "./namespace.ts" />
var namespc;
(function (namespc) {
    function addition(a, b) {
        return a + b;
    }
    namespc.addition = addition;
})(namespc || (namespc = {}));
// Usage
