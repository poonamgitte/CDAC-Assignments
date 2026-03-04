
// controllers/calculator.js

// A simple function to parse and validate numbers from the query string
function getOperands(req) {
    const num1 = parseFloat(req.query.num1);
    const num2 = parseFloat(req.query.num2);
    
    // Simple validation
    if (isNaN(num1) || isNaN(num2)) {
        throw new Error("Invalid or missing number parameters (num1 and num2 are required).");
    }
    return { num1, num2 };
}

exports.add = (req, res) => {
    try {
        const { num1, num2 } = getOperands(req);
        const result = num1 + num2;
        res.send({ type: "success", operation: "addition", result: result });
    } catch (error) {
        res.status(400).send({ type: "error", msg: error.message });
    }
};

exports.subtract = (req, res) => {
    try {
        const { num1, num2 } = getOperands(req);
        const result = num1 - num2;
        res.send({ type: "success", operation: "subtraction", result: result });
    } catch (error) {
        res.status(400).send({ type: "error", msg: error.message });
    }
};

exports.multiply = (req, res) => {
    try {
        const { num1, num2 } = getOperands(req);
        const result = num1 * num2;
        res.send({ type: "success", operation: "multiplication", result: result });
    } catch (error) {
        res.status(400).send({ type: "error", msg: error.message });
    }
};

exports.division = (req, res) => {
    try {
        const { num1, num2 } = getOperands(req);
        
        if (num2 === 0) {
            throw new Error("Cannot divide by zero.");
        }
        
        const result = num1 / num2;
        res.send({ type: "success", operation: "division", result: result });
    } catch (error) {
        res.status(400).send({ type: "error", msg: error.message });
    }
};