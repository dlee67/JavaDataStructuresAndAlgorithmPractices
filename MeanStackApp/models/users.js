const mongoose = require('mongoose');
const bcrypt = require('bcryptjs');
const config = require('../config/database');

// User Schema
const UserSchema = mongoose.Schema({
	name: {
		type: String 
	},
	email: {
		type: String, 
		required: true
	},
	username: {
		type: String,
		required: true
	},
	password: {
		type: String,
		required: true
	}
});

//Explained more here.
//http://mongoosejs.com/docs/3.5.x/docs/api.html#model_Model-model
const User = module.exports = mongoose.model('User', UserSchema);
module.exports.getUserById = (id, callback) => {
	User.findById(id, callback);
}
module.exports.getUserByUsername = (username, callback) => {
	const query = {username: username}
	User.findOne{query, callback}; 
}
module.exports.addUser = (newUser, callback) => {
	bcrypt.genSalt(10, () => {
		bcrypt.hash(newUser.password, salt, (err, hash) => {
			if(err) throw err;
			newUser.password = hash;
			newUser.save(callback);
		});
	});
} 	