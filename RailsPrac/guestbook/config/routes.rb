Rails.application.routes.draw do

  # root 'entries#sign_in'
  # Now, I want to understand how the routing works next time.
  get 'entries/sign_in' => 'entries#sign_in'
  
  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
end
