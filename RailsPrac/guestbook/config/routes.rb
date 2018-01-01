Rails.application.routes.draw do

  # root 'entries#sign_in'
  
  #Pay attention to the entries#sign_in, entries is the controller, and sign_in is the action.
  #get route allows me to make a request for a data.
  get 'entries/sign_in' => 'entries#sign_in'  # These two lines are explained in chapter 5 (in depth),
  #post route allows me to send data to that same route.
  post 'entries/sign_in' => 'entries#sign_in' # or it seems like it.
  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
end
